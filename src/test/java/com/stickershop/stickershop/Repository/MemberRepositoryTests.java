package com.stickershop.stickershop.Repository;

import com.stickershop.domain.Member;
import com.stickershop.domain.Role;
import com.stickershop.repository.MemberRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class MemberRepositoryTests {
	@Autowired
	MemberRepository memberRepository;

	@Test
	public void 특정email사용자정보읽어들이기() throws Exception{
		Member member = memberRepository.getMember("koola1@gmail.com");
		System.out.println(member.getId());
		for(Role role : member.getRoleSet()) {
			System.out.println(role.getName());
		}
	}
}
