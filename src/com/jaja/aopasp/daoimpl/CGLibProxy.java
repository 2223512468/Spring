package com.jaja.aopasp.daoimpl;

import com.jaja.aopasp.dao.UserDao;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用CGLib生成代理对象 CGLIB生成代理机制:其实生成了一个真实对象的子类.对类的操作
 *
 * @author terry
 */
public class CGLibProxy implements MethodInterceptor {
    private UserDaoImpl userDao;

    public CGLibProxy(UserDaoImpl userDao) {
        super();
        this.userDao = userDao;
    }

    public UserDaoImpl createCGProxy() {
        // 使用CGLIB生成代理:
        // 1.创建核心类:
        Enhancer enhancer = new Enhancer();
        // 2.为其设置父类:
        enhancer.setSuperclass(userDao.getClass());
        // 3.设置回调:
        enhancer.setCallback(this);
        // 4.创建代理:
        return (UserDaoImpl) enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("add".equals(method.getName())) {
            System.out.println("日志记录==============");
            Object obj = methodProxy.invokeSuper(proxy, args);
            return obj;
        }
        return methodProxy.invokeSuper(proxy, args);
    }
}
