package com.emp.empmanagement.controller;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MemberManageController {

    @Resource
    MemberService memberService;
    @RequestMapping("/menbermanage")
    public String memberManage(Model model){
        //调用查询所有数据的方法
        List<Member> memberList = memberService.queryAll();
        //将查询到的数据通过model添加到前端
        model.addAttribute("memberList",memberList);
        //指定返回界面为manage
        return "member/manage";
    }

    @RequestMapping(value = "/updateMember", method = RequestMethod.POST)
    public String addMember(Member member) {
        //调用更新方法
        memberService.update(member);
        //更新成功后重新进入menbermanage控制器，也就是刷新manage界面
        return "redirect:/menbermanage";
    }

    @RequestMapping(value = "/searchMember", method = RequestMethod.POST)
    public String searchMember(Model model, Member member) {
        //调用service的条件查询方法，返回Member列表
        List<Member> selectedMemberList =  memberService.queryByCondition(member.getName(), member.getGender(), member.getAge());
        //将查询到的List添加到前端
        model.addAttribute("selectedMemberList", selectedMemberList);

        System.out.println("member = " + member.toString());
        for (int i=0; i<selectedMemberList.size(); i++){
            System.out.println("selectedMember = " + selectedMemberList.get(i).toString());
        }
        //指定跳转到search界面
        return "/member/search";
    }
}
