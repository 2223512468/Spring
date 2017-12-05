package com.jaja.aopasp.daoimpl;

import com.jaja.aopasp.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK的动态代理的机制 对接口的操作
 *
 * @author terry
 */
public class JDKProxy implements InvocationHandler {

    private UserDao userDao;

    public JDKProxy(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    public UserDao createProxy() {
        UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return proxy;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("add".equals(method.getName())) {
            System.out.println("日志记录=================");
            Object result = method.invoke(userDao, args);
            return result;
        }
        return method.invoke(userDao, args);
    }
}
