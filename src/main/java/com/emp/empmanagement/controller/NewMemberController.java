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

    /**
     * 这是一个界面控制器，用于返回新增成员界面
     * */
    @RequestMapping(value = "/newMemberPage")
    public String newMemberPage(){
        return "member/newMemberPage";
    }

    /**
    * 新增成员控制器，对应前端新增按钮
    * */
    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public String addMember(Member member) {
        System.out.println(member.toString());
        if(memberService.insert(member)){ //如果插入失败跳到error界面
            return "memberManagementPage";
        }else{
            return "/states/error";
        }

    }
}
