package com.emp.empmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    /**
     * 这是一个页面控制器，用于返回menu界面
     * */
    @RequestMapping("/menu")
    public String menu(){
        return "menu";
    }
}
