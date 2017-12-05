package com.jaja.aopasp.test;

import com.jaja.aopasp.dao.UserDao;
import com.jaja.aopasp.daoimpl.CGLibProxy;
import com.jaja.aopasp.daoimpl.JDKProxy;
import com.jaja.aopasp.daoimpl.UserDaoImpl;
import org.junit.Test;

public class SpringAopTest {

    @Test
    public void test() {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.update();
    }

    @Test
    public void test1() {
        // 被代理对象
        UserDao userDao = new UserDaoImpl();
        // 创建代理对象的时候传入被代理对象.
        UserDao proxy = new JDKProxy(userDao).createProxy();
        proxy.add();
        proxy.update();
    }

    @Test
    public void test2() {
        UserDaoImpl userDao = new UserDaoImpl();
        UserDaoImpl cgProxy = new CGLibProxy(userDao).createCGProxy();
        cgProxy.add();
        cgProxy.update();
    }
}
