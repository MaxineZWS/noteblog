package com.zwsblog.user.mapper;

import com.zwsblog.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> ListByName(String name);

    void add(User user);

    void update(User user);

    void del(Integer id);
}
