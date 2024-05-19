package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface UserMapper {
    //@Select("select * from springmvc.user where userName=#{userName} and password=#{password}")
    public List<User> getInfo(String username, String password);

    void reGist(String username, String password);

    List<User> selectByName(String username);
}
