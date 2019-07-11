package com.xj.web.controller;

import com.xj.model.User;


import com.xj.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {

    @RequestMapping("{id}")
    @ResponseBody
    public User userInfo(@PathVariable() Integer id){

        User user = new User("xj","666");
        user.setId(id);
        return  user;
    }

    @Autowired
    private UserServiceImpl userService;



    @RequestMapping("register")

    public  String register(String username,String password){



        //把数据保存到test1
        userService.register(username,password);
        //把数据保存到test2
        return "user/list";
    }



    /*
    public static void main(String[] args) {
        //启动springboot项目
        SpringApplication.run(UserController.class,args);
    }
    */


}
