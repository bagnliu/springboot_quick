package com.example.springboot_quick.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bagnliu
 * @create 2020-06-04 19:49
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class Domets1 {

    private String name;
    private String adrr;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {

        return "name is " + name + "adrr is "+ adrr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }
}
