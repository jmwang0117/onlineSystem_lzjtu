package com.wjm.dao;

import com.wjm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    @Select("select * from admin")
    public List<User> findAll();

    //查找用户
    @Select("select * from admin where username = #{username}")
    public User findUsersByUsername(@Param("username") String username);
    //查找用户
    @Select("select * from admin where role = #{role}")
    public User findUsersByrole(@Param("role") int role);
    //删除用户
    @Select(" delete  from admin where id=#{id}")
    public User DeleteUsersByrole(@Param("id") Integer id);


    @Select("select * from admin where username = #{username} and PASSWORD = #{PASSWORD}")
    public User queryUser(@Param("username") String userName, @Param("PASSWORD") String passWord);


    //添加用户
    @Select("insert into admin(username,PASSWORD,email,telephone,role)" +
            " value(#{username},#{PASSWORD},#{email},#{telephone},#{role})")
    public User insertUser( @Param("username") String username,@Param("PASSWORD") String PASSWORD,@Param("email") String email,
                           @Param("telephone") String telephone,@Param("role")int role);

    //修改密码
    @Select("update admin set PASSWORD=#{PASSWORD} where username=#{username}")
    public User modifyPasswordByUsername(@Param("username") String username,@Param("PASSWORD") String PASSWORD);





}
