package com.sy.servlet.impl;

import com.sy.dao.UserDao;
import com.sy.domain.Users;
import com.sy.servlet.ServletUser;
import com.sy.until.SqlSessionUtil;

import java.util.List;

public class ServletUserImpl implements ServletUser {
    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Override
    public List<Users> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public Integer insertUser(Users users) {
        return userDao.insertUser(users);
    }

    @Override
    public Users selectoneUser2(int id, String name) {
        return userDao.selectoneUser2(id,name);
    }
}
