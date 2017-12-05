package com.jajahome;

import com.jajahome.daoImpl.CustomerServiceImpl;
import com.jajahome.daoImpl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnaTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    public void test1() {
        CustomerServiceImpl customerImpl = (CustomerServiceImpl) applicationContext.getBean("customerServiceImpl");
        System.out.print(customerImpl);
    }

}
