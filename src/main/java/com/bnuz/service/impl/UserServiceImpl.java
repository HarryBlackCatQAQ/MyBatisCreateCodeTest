package com.bnuz.service.impl;

import com.bnuz.domain.User;
import com.bnuz.dao.UserDao;
import com.bnuz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Harry
 * @Date: 2019-05-09 13:42
 * @Version 1.0
 */

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public List<User> getAllByName(String name) {
        return null;
    }

    @Override
    public void save(User user) {
        userDao.insert(user);
    }

    @Override
    public void saveSelective(User user) {
        userDao.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userDao.updateByPrimaryKey(user);
    }

    @Override
    public void updateSelective(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(User user) {

    }
}