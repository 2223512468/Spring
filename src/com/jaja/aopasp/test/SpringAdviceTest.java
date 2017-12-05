package com.jaja.aopasp.test;


import com.jaja.aopasp.dao.OrderDao;
import com.jaja.aopasp.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringAdviceTest {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    @Qualifier("customerDaoProxy")
    private UserDao userDaoProxy;


    @Autowired
    @Qualifier("orderProxy")
    private OrderDao orderDaoProxy;


    @Test
    public void test() {
        userDao.add();
        userDao.update();
    }

    @Test
    public void test1(){
        userDaoProxy.add();
        userDaoProxy.update();
    }

    @Test
    public void test2(){
        orderDaoProxy.add();
        orderDaoProxy.delete();
        orderDaoProxy.update();
        orderDaoProxy.find();
    }

}
