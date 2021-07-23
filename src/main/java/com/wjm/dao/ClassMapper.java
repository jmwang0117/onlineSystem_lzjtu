package com.wjm.dao;

import com.wjm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMapper {
    @Select("select * from admin")
    public List<User> findAll();
    //添加用户
    @Select("insert into class(name,classfication,price,teacher,text,time)" +
            " value(#{name},#{classfication},#{price},#{teacher},#{text},#{time})")
    public Class insertClass( @Param("name") String name, @Param("classfication") String classfication,@Param("price") String price,
                           @Param("teacher") String teacher, @Param("text")String text, @Param("time")String time);



}
