package com.yxs.atcrowdfunding.controller;

import com.yxs.atcrowdfunding.bean.User;
import com.yxs.atcrowdfunding.manager.service.UserService;
import com.yxs.atcrowdfunding.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DispatcherController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/main")
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/doLogin")
    public String doLogin(String loginacct, String userpswd, String type, HttpSession session){

        System.out.println("进入登录界面");

        Map<String,Object>paramMap = new HashMap<String,Object>();

        paramMap.put("loginacct",loginacct);
        paramMap.put("userpswd",userpswd);
        paramMap.put("type",type);

        User user = userService.queryBylogin(paramMap);

        session.setAttribute(Const.LOGIN_USER,user);

        return "redirect:/main.htm";
    }
}
