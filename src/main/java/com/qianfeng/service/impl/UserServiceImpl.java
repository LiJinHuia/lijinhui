package com.qianfeng.service.impl;

import com.qianfeng.dao.UserMapper;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public User login(String name, String password) {
        User user = userDao.selectByName(name);
        if (user == null) {
            throw new RuntimeException("用户名错误");
        }
        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("密码错误");

        }
        return user;
    }

    @Override
    public void register(User user) {
        User user1 = userDao.selectByName(user.getUname());
        if (user1 == null) {
            try {
                userDao.insertSelective(user);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
        }
        if (user1 != null) {
            throw new RuntimeException("用户名已被注册，请重新注册");
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            userDao.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("用户信息修改失败");
        }
    }
}
