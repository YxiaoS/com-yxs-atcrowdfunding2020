package com.yxs.atcrowdfunding.manager.controller;

import com.yxs.atcrowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    public String test() {
        System.out.println("TestController");

        testService.insert();
        return "success";
    }

}
