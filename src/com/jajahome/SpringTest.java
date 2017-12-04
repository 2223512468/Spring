package com.jajahome;

import com.jajahome.dao.CustomerSpring;
import com.jajahome.dao.HelloSpring;
import com.jajahome.daoImpl.HelloSpringImpl;
import com.jajahome.model.Product;
import com.jajahome.model.RedCar;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    private ApplicationContext applicationContext;
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        HelloSpring helloSpring = new HelloSpringImpl();
        helloSpring.sayHello();
    }

    @Test
    public void test1() {
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("spring");
        helloSpring.sayHello();
    }

    @Test
    public void test2() {
        Product product = (Product) classPathXmlApplicationContext.getBean("product");
        System.out.print(product);
        classPathXmlApplicationContext.close();
    }

    @Test
    public void test3() {
        CustomerSpring customerSpring = (CustomerSpring) classPathXmlApplicationContext.getBean("customerSpring");
        customerSpring.add();
        customerSpring.find();
        classPathXmlApplicationContext.close();

    }

    @Test
    public void test4() {
        RedCar redCar = (RedCar) applicationContext.getBean("redCar");
        System.out.print(redCar);
    }

}
