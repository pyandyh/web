package com.example.service;

import com.example.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> getInfo(String userName, String password);

    void reGist(String username, String password);

    int selectByName(String username);
}
