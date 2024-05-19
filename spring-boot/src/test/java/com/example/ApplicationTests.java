package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        List<User> user=userService.getInfo("plfds","fsdaf");
        System.out.println(user);
    }

}
