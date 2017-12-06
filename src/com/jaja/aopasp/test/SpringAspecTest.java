package com.jaja.aopasp.test;


import com.jaja.aopasp.dao.OrderDao;
import com.jaja.aopasp.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class SpringAspecTest {

    @Autowired
    @Qualifier("orderDao")
    private OrderDao orderDao;

    @Autowired
    @Qualifier("productDao")
    private Product productDao;


    @Test
    public void test() {
        orderDao.add();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }

    @Test
    public void test1() {
        productDao.add();
        productDao.delete();
        productDao.update();
        productDao.find();
    }

}
