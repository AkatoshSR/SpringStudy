package com.sqx.service;

import com.sqx.Dao.UserDao;
import com.sqx.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    // 初始化
    private void init(){
        userDao = new UserDaoImpl();
    }

    public UserServiceImpl() {
        init();
    }

    // 控制
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
