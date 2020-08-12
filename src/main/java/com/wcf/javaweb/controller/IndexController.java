package com.wcf.javaweb.controller;

import com.wcf.javaweb.pojo.UserFeature;
import com.wcf.javaweb.service.UserFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller

public class IndexController {

    @RequestMapping("/")

    public String first(){
        return "index";
    }

    @RequestMapping("/info/{msg}")
    @ResponseBody
    public String show(@PathVariable String msg)
    {
        return "show"+msg;
    }

    @RequestMapping("/page")
    public String showPage(Model model)
    {
        model.addAttribute("name","com.wcf");
        return "show";
    }

    @RequestMapping("thymeleafPage")
    public String showThymeleaf(Model model)
    {
        model.addAttribute("word","This is a single word");
        return "index";
    }
    @Autowired
    private UserFeatureService userFeatureService;

    @RequestMapping("/save")
    @ResponseBody
    public String saveUserFeature(UserFeature userFeature){



        userFeatureService.addUserFeature(userFeature);
        return "success";
    }
}
