package com.stickershop.repository;

import com.stickershop.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,String> {

    public Page<Member> findAll(Pageable pageable);

    @Query(value="select me from Member me where me.id=(:id)")
    public Member findByIdContaining1(@Param("id") String id);


    @Query(value="select id, email, phone from Member me where me.id= :id")
    public String findByIdContaining2(@Param("id") String id);

    @Query(value="select me.id, me.email, me.phone from Member me where me.id= :id")
    public Member findByIdContaining3(@Param("id") String id);

}
