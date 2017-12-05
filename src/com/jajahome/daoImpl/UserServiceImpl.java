package com.jajahome.daoImpl;

import com.jajahome.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/*@Service(用于标注业务层)*/
@Service("userService")
/*配置Bean的作用范围:*/
@Scope
public class UserServiceImpl {

    @Value("com.jajahome")
    private String info;

    @Resource(name = "userDao")
    private UserDao userDao;


    public void sayHello() {
        System.out.println("Hello Spring Annotation..." + info);
    }

    @PostConstruct
    public void setUp() {
        System.out.println("初始化...");
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("销毁...");
    }

}
