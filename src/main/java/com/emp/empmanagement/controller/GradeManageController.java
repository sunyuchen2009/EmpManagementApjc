package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Course;
import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.service.CourseService;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GradeManageController {

    @Resource
    GradeService gradeService;

    @Resource
    CourseService courseService;

    @RequestMapping("/gradeManagementPage")
    public String gradeManagementPage(Model model){
        List<Grade> gradeList = gradeService.queryAll();
        List<Course> courseList = courseService.queryAll();
        model.addAttribute("courseList", courseList);
        model.addAttribute("gradeList", gradeList);
        return "/grade/grademanagement";
    }

    @RequestMapping(value = "/searchGrade", method = RequestMethod.POST)
    public String searchGrade(Model model, Grade grade){
        //调用service的条件查询方法，返回Grade列表
        List<Grade> selectedGradeList =  gradeService.queryByCondition(grade.getName(), grade.getCourseName());
        List<Course> courseList = courseService.queryAll();
        //将查询到的List添加到前端
        model.addAttribute("courseList", courseList);
        model.addAttribute("selectedGradeList", selectedGradeList);

        //指定跳转到search界面
        return "/grade/search";
    }

    @RequestMapping(value = "/updateGrade", method = RequestMethod.POST)
    public String updateGrade(Model model, Grade grade){
        List<Course> courseList = courseService.queryAll();
        //将查询到的List添加到前端
        model.addAttribute("courseList", courseList);
        if(!gradeService.update(grade)){ //更新失败跳转error界面，暂用menu
            return "/menu";
        }else{
            return "redirect:/gradeManagementPage";
        }

    }
}
