package com.jajahome.daoImpl;

import com.jajahome.dao.HelloSpring;

public class HelloSpringImpl implements HelloSpring {

    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello Spring..." + info);
    }
}
