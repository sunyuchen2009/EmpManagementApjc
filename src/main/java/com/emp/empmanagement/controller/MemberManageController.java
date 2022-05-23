package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Controller
public class MemberManageController {

    @Resource
    MemberService memberService;
    @RequestMapping("/menbermanage")
    public String memberManage(Model model){
        List<Member> memberList = memberService.queryAll();
        model.addAttribute("memberList",memberList);
        return "menbermanage";
    }

    @RequestMapping(value = "/updateMember", method = RequestMethod.POST)
    public String addMember(Member member) {
        memberService.update(member);
        return "redirect:/menbermanage";
    }

    @RequestMapping(value = "/searchMember", method = RequestMethod.POST)
    @ResponseBody
    public List<Member> searchMember(Model model, Member member) {
        List<Member> selectedMemberList =  memberService.queryByCondition(member.getName(), member.getGender(), member.getAge());
        model.addAttribute("selectedMemberList", selectedMemberList);

        System.out.println("member = " + member.toString());
        for (int i=0; i<selectedMemberList.size(); i++){
            System.out.println("selectedMember = " + selectedMemberList.get(i).toString());
        }
        return selectedMemberList;
    }
}
