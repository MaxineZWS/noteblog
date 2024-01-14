package com.zwsblog.user.service;

import com.zwsblog.user.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    List<User> listByName(String name, Integer curpage, Integer pageSize);

    void add(User user);

    void update(User user);

    void del(Integer id);

}
