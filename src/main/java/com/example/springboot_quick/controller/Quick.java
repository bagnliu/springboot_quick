package com.example.springboot_quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bagnliu
 * @create 2020-06-04 0:25
 */
@Controller
public class Quick {

    @RequestMapping("/find")
    @ResponseBody
    public String find(){
        return "helo word!, wo ai wojia bao bei 111";
    }



    
}
