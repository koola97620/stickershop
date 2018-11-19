package com.stickershop.service;

import com.stickershop.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberService {

    public List<Member> getMemberList();

    public Page<Member> getFindAllPageable(Pageable pageable);
}
