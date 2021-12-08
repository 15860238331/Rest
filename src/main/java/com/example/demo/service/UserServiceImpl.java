package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            System.out.println(user.getName());
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);

    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
