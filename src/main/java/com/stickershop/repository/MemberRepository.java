package com.stickershop.repository;

import com.stickershop.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemberRepository extends JpaRepository<Member,String> {

    public Member findAllById(String id);

}
