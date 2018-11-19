package com.stickershop.service;

import com.stickershop.domain.Member;
import com.stickershop.repository.MemberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    @Transactional
    public List<Member> getMemberList() {
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }

    @Override
    @Transactional
    public Page<Member> getFindAllPageable(Pageable pageable){
        Page<Member> memberList = memberRepository.findAll(pageable);
        return memberList;
    }
}
