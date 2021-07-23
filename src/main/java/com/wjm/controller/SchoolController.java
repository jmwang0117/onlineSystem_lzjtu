package com.wjm.controller;

import com.wjm.domain.School;
import com.wjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SchoolController {

    @Autowired
    private UserService userService;
    @RequestMapping("/insert")
    public String insertSchool(Model model, HttpServletRequest request, HttpServletResponse response, String school_name, String people, String telephone, String astrict) {

        School school1 = userService.findSchoolByname("兰州交通大学");
        request.getSession().setAttribute("user11", school1);
        // 调用service完成注册操作
//        System.out.println(user);
        userService.insertSchool(school_name, people, telephone, astrict);

       /*

        School school2 = userService.findSchoolByname(school_name);

        request.getSession().setAttribute("user22", school2);*/
        return "jibenxinxi";
    }


}
