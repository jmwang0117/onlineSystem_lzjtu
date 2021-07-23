package com.wjm.dao;

import com.wjm.domain.School;
import com.wjm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolMapper {

    @Select("insert into school(school_name,people,telephone,astrict)" +
            " value(#{school_name},#{people},#{telephone},#{astrict})")
    public School insertSchool(@Param("school_name") String school_name, @Param("people") String people, @Param("telephone") String telephone,
                              @Param("astrict") String astrict);
    //查找用户
    @Select("select * from school where school_name = #{school_name}")
    public School findSchoolByname(@Param("school_name") String school_name);




}
