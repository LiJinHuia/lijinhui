package com.qianfeng.service;

import com.qianfeng.pojo.User;

public interface UserService {

    public User login(String name, String password);

    public void register(User user);

    public void updateUser(User user);
}
