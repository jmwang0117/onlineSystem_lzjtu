package com.wjm.service.Impl;

import com.wjm.dao.ClassMapper;
import com.wjm.dao.SchoolMapper;
import com.wjm.dao.UserMapper;
import com.wjm.domain.School;
import com.wjm.domain.User;
import com.wjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    @Autowired
    private  ClassMapper classmapper;
    @Autowired
    private  SchoolMapper schoolmapper;


    @Override
    public List<User> findAll(){
        System.out.println("Service 业务层：查询所有账户");
        List<User> a = usermapper.findAll();
        return a;
    }

    @Override
    public boolean isUserExist(String username){
        if (usermapper.findUsersByUsername(username) == null) {
            return false;
        } else {
            return true;
        }
    }
    //根据用户名取密码
    @Override
    public String getPasswordByUsername(String username){
            return usermapper.findUsersByUsername(username).getPASSWORD();
    }


    @Override
    public User queryUser(String userName,String passWord){
        return usermapper.queryUser(userName,passWord);
    }

    //添加用户
    @Override
    public User addUser(String username,String PASSWORD,String email,String telephone,int role)
    {
        return usermapper.insertUser(username,PASSWORD,email,telephone, role);

    }
    //修改密码
    @Override
    public User modifyPasswordByUsername(String username,String PASSWORD){

        return usermapper.modifyPasswordByUsername(username,PASSWORD);

    }

    @Override
    public User findUsersByrole( int role){

        return usermapper.findUsersByrole(role);

    }
    @Override
    public User DeleteUsersByrole(Integer id){
        return  usermapper.DeleteUsersByrole(id);
    }

    @Override
    public Class addClass(String name,String classfication, String price,String teacher, String text,String time){
        return classmapper.insertClass(name,classfication,price,teacher,text,time);
    }


    @Override
    public School insertSchool(String school_name, String people, String telephone, String astrict){
        return schoolmapper.insertSchool(school_name,people,telephone,astrict);

    }
    @Override
    public School findSchoolByname(String school_name){
        return schoolmapper.findSchoolByname(school_name);




    }

}
