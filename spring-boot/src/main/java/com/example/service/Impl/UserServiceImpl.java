package com.example.service.Impl;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getInfo(String username, String password) {
        System.out.println(userMapper);
        return userMapper.getInfo(username,password);
    }
    @Override
    public void reGist(String username, String password) {
        userMapper.reGist(username,password);
    }

    @Override
    public int selectByName(String username) {
        int count = 0;
        count=userMapper.selectByName(username).size();
        return count;
    }
}
