package com.emp.empmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @RequestMapping("/menu")
    public String menu(){
        return "menu";
    }
}
