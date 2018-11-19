package com.stickershop.controller;

import com.stickershop.domain.Member;
import com.stickershop.service.MemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private MemberService memberService;

    public HomeController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap,
                       @PageableDefault(sort={"id"},direction = Sort.Direction.DESC,size=2) Pageable pageable) {
        List<Member> memberList = memberService.getMemberList();
        modelMap.addAttribute("memberList", memberList);

        Page<Member> members = memberService.getFindAllPageable(pageable);
        modelMap.addAttribute("members", members);
        return "list";
    }
}
