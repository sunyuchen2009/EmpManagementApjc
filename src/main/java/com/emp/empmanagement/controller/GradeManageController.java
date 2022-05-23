package com.emp.empmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeManageController {

    @RequestMapping("/grademanagement")
    public String menu(){
        return "grademanagement";
    }
}
