package com.zwsblog.user.service.impl;

import com.zwsblog.user.entity.User;
import com.zwsblog.user.mapper.UserMapper;
import com.zwsblog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listByName(String name, Integer curpage, Integer pageSize) {
        List<User> userList = userMapper.ListByName(name);
        return userList;
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void del(Integer id) {
        userMapper.del(id);
    }
}
