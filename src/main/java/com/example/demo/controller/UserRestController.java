package com.example.demo.controller;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "对用户操作接口",tags = "用户管理")
@RestController
@RequestMapping(value = "/api",produces =MediaType.APPLICATION_JSON_VALUE)
public class UserRestController {
   @Autowired
    private UserService userService;

    @ApiOperation(value = "添加用户")
    @PostMapping(value = "/user")
    public boolean addUser(@RequestParam User user) {
        System.out.println("开始新增...");
        return userService.addUser(user);
    }
    @ApiOperation(value = "更新用户")
    @PutMapping(value = "/user")
    public boolean updateUser( @RequestParam User user) {
        System.out.println("开始更新...");
        return userService.updateUser(user);
    }
    @ApiOperation(value = "删除用户")
    @DeleteMapping(value = "/user")
    public boolean delete(@RequestParam int userId) {
        System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }

    @ApiOperation(value = "根据姓名查找用户")
    @GetMapping(value = "/user")
    public User findByUserName(@RequestParam String userName) {
        System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }

    @ApiOperation(value = "查询所有用户")
    @GetMapping(value = "/users")
    public List<User> findByUserAge() {
        System.out.println("开始查询所有数据...");
        return userService.findAll();
    }

}
