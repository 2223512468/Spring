package com.jaja.aopasp.test;

import com.jaja.aopasp.dao.OrderDao;
import com.jaja.aopasp.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*测试自动生成代理*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringAutoProxyTest {

    @Autowired
    @Qualifier("orderDao")
    private OrderDao orderDao;

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;


    @Test
    public void test() {
        orderDao.find();
        orderDao.delete();
        orderDao.update();
        orderDao.add();
        userDao.update();
    }

}
