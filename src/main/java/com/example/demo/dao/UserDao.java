package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
    void addUser(User user);


    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);


    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);


    @Select("SELECT id,name,age FROM t_user where name=#{userName}")
    User findByName(@Param("userName") String userName);


    @Select("SELECT id,name,age FROM t_user")
    List<User> findAll();

}
