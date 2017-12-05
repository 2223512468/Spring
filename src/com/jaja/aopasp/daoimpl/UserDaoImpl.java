package com.jaja.aopasp.daoimpl;

import com.jaja.aopasp.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }
}
