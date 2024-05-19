package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.pojo.Result;
import com.example.pojo.User;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

@CrossOrigin
@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public Result login(@RequestParam("key1") String username,
                        @RequestParam("key2") String password){
        List<User> user=userService.getInfo(username,password);
        User user1=null;
        if(user.size()!=0) user1=user.get(0);
        int state=0;
        if(user1!=null) state=user1.getState();
        if(state==1){
            System.out.println("登陆成功");
            return Result.success(user);
        }
        else {
            System.out.println("登录失败");
            user1 = new User();
            user1.setState(0);
            user.add(user1);
            return Result.success(user);
        }
    }
    @PostMapping("/regist")
    public Result regist(@RequestParam("key1") String username,
                         @RequestParam("key2") String password,
                         @RequestParam("key3") String rePassword){
        if(username==null||password==null||"".equals(username)||"".equals(password)){
            return Result.success(2);
        }
        username=username.trim();
        password=password.trim();
        if(username.length()<5||password.length()<5){
            return Result.success(3);
        }
        if(username.length()>15||password.length()>15){
            return Result.success(4);
        }
        if(password.equals(rePassword)==false){
            return Result.success(5);
        }
        //0 账号已存在
        //1 注册成功
        int count = userService.selectByName(username);
        if(count!=0) return Result.success(0);
        userService.reGist(username,password);
        return Result.success(1);
    }
}
