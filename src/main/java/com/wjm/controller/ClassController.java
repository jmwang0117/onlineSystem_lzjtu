package com.wjm.controller;

import com.wjm.domain.User;
import com.wjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ClassController {
    @Autowired
    private UserService userService;
    @RequestMapping("/class1")
    public  String delete(Model model, HttpServletRequest request, HttpServletResponse response,String name,String classfication, String price,String teacher, String text,String time)
    {
        System.out.println(name+classfication+price+teacher+text+time);
        userService.addClass(name,classfication, price,teacher,text,time);
        return "/new_file";
    }




}
