package com.example.springboot_quick.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bagnliu
 * @create 2020-06-04 19:49
 */
@Controller
public class Domets {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String psersion;

    @RequestMapping("/get1")
    @ResponseBody
    public String get1() {

        return "name is " + name + "psersion is "+ psersion;
    }
}
