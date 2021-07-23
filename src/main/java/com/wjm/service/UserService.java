package com.wjm.service;

import com.wjm.domain.School;
import com.wjm.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User queryUser(String userName,String passWord);

    public boolean isUserExist(String username);
    //添加用户
    public User addUser(String username,String PASSWORD,String email,String telephone,int role);

    //修改密码
    public User modifyPasswordByUsername(String username,String PASSWORD);

    //根据用户名取密码
    public String getPasswordByUsername(String username);

    public User findUsersByrole( int role);

    public User DeleteUsersByrole(Integer id);

    public Class addClass(String name,String classfication, String price,String teacher, String text,String time);

    public School insertSchool(String school_name, String people, String telephone, String astrict);

    public School findSchoolByname(String school_name);
}
