package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class NewMemberController {

    @Resource
    private MemberService memberService;
    @RequestMapping(value = "/newMemberPage")
    public String newMemberPage(){
        return "/member/newmenber";
    }

    /*
    * 处理post传来的表单信息，新增到数据库
    * */
    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public String addMember(Member member) {
        System.out.println(member.toString());
        if(!memberService.insert(member)){ //如果插入失败跳到error界面
            return "/menu";
        }else{
            return "redirect:/gradeManagementPage";
        }
    }
}
