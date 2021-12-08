建表rest
CREATE DATABASE `rest`;
 
USE `rest`;
 
DROP TABLE IF EXISTS `t_user`;
 
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `age` int(2) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

搭建 pojo实体类层
     Controller 控制层
     Servie 接口层
     Dao 连接数据库层
     
配置文件中 配置连接
pojo实体类层(lombok注解)
 Controller 控制层(restcontroller返回的是json数据)

 Dao 连接数据库层(用sql语句实现数据库操作)

Postman测试接口
