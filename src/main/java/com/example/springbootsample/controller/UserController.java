package com.example.springbootsample.controller;

import com.example.springbootsample.model.User;
import com.example.springbootsample.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfo userInfo;

    @GetMapping(value = "/info")
    @ResponseBody
    public List<User> findAll() {
        User user = new User();
        user.setId(userInfo.getId());
        user.setName(userInfo.getName());
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
