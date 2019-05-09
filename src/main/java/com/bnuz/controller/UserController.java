package com.bnuz.controller;

import com.bnuz.domain.User;
import com.bnuz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Harry
 * @Date: 2019-05-09 13:32
 * @Version 1.0
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/userInsert")
    public User getUser(String name,String password){
        User user = new User();
        User user2 = new User();

        user.setName(name);
        user.setPassword(password);

        user2.setName(name + "2");
        user2.setPassword(password + "Two");

        System.out.println(user);
        System.out.println(user2);

        userService.save(user);
//        userService.saveSelective(user2);

        return user2;
    }


    @GetMapping(value = "/userUpdate")
    public User update(String name,String password){
        User user = new User();

        user.setName(name);
        user.setPassword(password);

        user.setId(3);

        System.out.println(user);

        userService.update(user);
//        userService.updateSelective(user);

        return user;
    }


    @GetMapping(value = "/userGetAll")
    public List<User> getAll(){

        return userService.getAll();
    }
}