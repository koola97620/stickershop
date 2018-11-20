package com.stickershop.controller;


import com.stickershop.domain.Member;
import com.stickershop.security.StickershopUserDetails;
import com.stickershop.service.MemberService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
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

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/info")
    public String info(Principal principal) {
        System.out.println(principal.getName());

        StickershopUserDetails loginUser =
                (StickershopUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("loginUser.getEmail() : " + loginUser.getEmail());
        System.out.println("loginUser.getId() : " + loginUser.getId());
        System.out.println("loginUser.getName() : " + loginUser.getName());
        System.out.println("loginUser.getPassword() : " + loginUser.getPassword());
        System.out.println("loginUser.getUsername() : " + loginUser.getUsername());
        Collection<GrantedAuthority> loginUserAuthorities = loginUser.getAuthorities();
//        for(int i=0; i < loginUserAuthorities.size() ; i++) {
//            System.out.println("loginUser.getAuthorities(" + i + ") : " + loginUserAuthorities);
//        }
        List<GrantedAuthority> list=new ArrayList<>(loginUserAuthorities);
        for(int i=0; i < loginUserAuthorities.size() ; i++) {
            System.out.println("loginUser.getAuthorities(" + i + ") : " + list.get(i));
        }


        for(GrantedAuthority authority : loginUserAuthorities) {
            System.out.println("authority : " + authority);
        }

        return "info";
    }

}
