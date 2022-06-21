package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Course;
import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.service.CourseService;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewGradeController {
    @Resource
    CourseService courseService;
    @Resource
    GradeService gradeService;


    /**
     * 这是一个页面控制器，用于返回新增成绩界面
     * */
    @RequestMapping(value = "/newGradePage")
    public String gradePage(Model model, Grade grade){
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("courseList", courseList);
        return "/grade/newGradePage";
    }

    /**
     * 新增成员控制器，对应前端新增按钮
     * */
    @RequestMapping(value = "/newgrade", method = RequestMethod.POST)
    public String newGrade(Model model, Grade grade){
        if(gradeService.insert(grade)){ //这里插入失败的话可以返回一个error界面,暂时用menu
            return "/grade/gradeManagementPage";
        }else {
            return "/states/error";
        }
    }
}
