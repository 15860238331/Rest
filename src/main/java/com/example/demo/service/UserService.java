package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserByName(String userName);

    List<User> findAll();

}
