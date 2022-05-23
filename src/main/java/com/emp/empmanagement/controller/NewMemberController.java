package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.dao.MemberDao;
import com.emp.empmanagement.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class NewMemberController {

    @Resource
    private MemberService memberService;
    @RequestMapping(value = "/newmenber")
    public String menu(){
        return "newmenber";
    }

    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public String addMember(Member member) {
        System.out.println(member.toString());
        memberService.insert(member);
        return "redirect:/newmenber";
    }
}
