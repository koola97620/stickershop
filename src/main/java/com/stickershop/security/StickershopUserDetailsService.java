package com.stickershop.security;

import com.stickershop.domain.Member;
import com.stickershop.domain.Role;
import com.stickershop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class StickershopUserDetailsService implements UserDetailsService {

    @Autowired
    MemberService memberService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberService.getMember(email);
        if(member == null)
            throw new UsernameNotFoundException(email + " is not found");

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : member.getRoleSet()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+ role.getName()));
        }

        //UserDetails userDetails = new User(email,member.getPassword(),authorities);

        StickershopUserDetails userDetails = new StickershopUserDetails(email,member.getPassword(),authorities);
        userDetails.setId(member.getId());
        userDetails.setName(member.getNickname());
        userDetails.setPassword(member.getPassword());

        return userDetails;
    }



}
