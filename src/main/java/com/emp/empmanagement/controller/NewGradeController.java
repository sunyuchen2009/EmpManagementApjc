package com.emp.empmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewGradeController {

    @RequestMapping("/newgrade")
    public String menu(){
        return "newgrade";
    }
}
