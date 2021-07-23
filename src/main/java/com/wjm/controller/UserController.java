package com.wjm.controller;

import com.wjm.domain.User;
import com.wjm.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/delete")
    public  String delete(Model model, HttpServletRequest request, HttpServletResponse response,Integer id)
    {
        User user = userService.DeleteUsersByrole(3);
        return "/xueyuanbiao";
    }


    @RequestMapping("/findAll")
    public String findAll(Model model, HttpServletRequest request, HttpServletResponse response,String username,String password){

        List<User> list   = userService.findAll();
        System.out.println(list);

        return "list";
    }
    @RequestMapping("/test")
    public String login(Model model,HttpServletRequest request, HttpServletResponse response,String username,String PASSWORD){

        User user   = userService.queryUser(username,PASSWORD);
        User Stu_dent   = userService.queryUser("wzz","123456");
        User wjm   = userService.queryUser("wjm","654321");
        request.getSession().setAttribute("user2", Stu_dent);
        request.getSession().setAttribute("user3", wjm);
        request.getSession().setAttribute("user1", user);
        System.out.println(user);
        if(user != null) {
            // 3.登录成功，将用户存储到session中


            // 获取用户的角色，其中用户的角色分普通用户和超级用户两种
           int USER =  user.getRole();
            System.out.println(USER);
            System.out.println(USER);
           if(USER==1)
           {

               return "/xueyuanbiao";
           }
           if (USER==2)
           {

               return "index";
           }
            if (USER==3)
            {
                return "kecheng";
            }
        }
        return "login";
    }



    @RequestMapping("/register")
    public String registerUser( String username,String PASSWORD,String email,String telephone,int role) {


        // 调用service完成注册操作
//        System.out.println(user);
        userService.addUser(username,PASSWORD,email,telephone,role);
        return "login";
    }

    @RequestMapping("/class")
    public String Class() {

        return "/student";
    }

    @RequestMapping("/modify_school")
    public String modify_school() {

        return "/jibenxinxi";
    }




    @RequestMapping("/register1")
    public String Class1() {

        return "/register";
    }

    @RequestMapping("/student")
    public String Student() {

       return "/message";
    }

    @RequestMapping("/study")
    public String Study() {

        return "/new_file";
    }
    @RequestMapping("/change1")
    public String Change1() {

        return "/changemm";
    }

    @RequestMapping("/english")
    public String English() {

        return "English";
    }

    @RequestMapping("/change")
    public String modify(Model model,String username,String PASSWORD,String password){

        if (!userService.isUserExist(username)) {
            model.addAttribute("msg", "用户名不存在！");
        } else {

                    String aa = userService.getPasswordByUsername(username);

            if (password.equals(aa)) {

                userService.modifyPasswordByUsername(username, PASSWORD);
                System.out.println("修改密码成功！");
                model.addAttribute("msg", "修改密码成功！");
                return "login";
            } else {
                model.addAttribute("msg", "密码错误！");

                System.out.println("密码错误！");
            }
        }
        return "/changemm";
    }



    @RequestMapping(value = "/quick3")
    public ModelAndView test3(HttpSession session, @Param("upload") MultipartFile uploadFile, ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
        String originalFilename = uploadFile.getOriginalFilename();
        try {
            uploadFile.transferTo(new File("E:\\upload\\"+originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path=session.getServletContext().getRealPath("/");
        System.out.println(path+" "+originalFilename);
        try{
            byte barr[]=uploadFile.getBytes();

            BufferedOutputStream bout=new BufferedOutputStream(
                    new FileOutputStream(path+"/"+originalFilename));
            bout.write(barr);
            bout.flush();
            bout.close();

        }catch(Exception e){System.out.println(e);}
        modelAndView.addObject("filename",originalFilename);
        modelAndView.setViewName("headSuccess");
        return modelAndView;

    }



}


