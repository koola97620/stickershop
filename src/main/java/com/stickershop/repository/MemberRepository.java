package com.stickershop.repository;

import com.stickershop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MemberRepository extends JpaRepository<Member,String> {

    public Member findAllByUsername(String username);

    @Query(value="select me from Member me where me.id=(:id)")
    public Member findByIdContaining1(@Param("id") String id);


    @Query(value="select id, email, phone from Member me where me.id= :id")
    public String findByIdContaining2(@Param("id") String id);

    @Query(value="select me.id, me.email, me.phone from Member me where me.id= :id")
    public Member findByIdContaining3(@Param("id") String id);

}
