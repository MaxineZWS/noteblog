package com.zwsblog.user.controller;

import com.zwsblog.user.entity.User;
import com.zwsblog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list(@RequestParam(defaultValue = "") String name , @RequestParam(defaultValue = "1")Integer curPage, @RequestParam(defaultValue = "10")Integer pageSize){
        List<User> page =    userService.listByName(name,curPage,pageSize);
        return page;
    }

    @RequestMapping("/add")
    public void add(User user){
        userService.add(user);
    }

    @RequestMapping("/update")
    public void update(User user){
        userService.update(user);
    }
    @RequestMapping("/del")
    public void del(Integer id){
        userService.del(id);
    }

}
