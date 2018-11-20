package com.stickershop.stickershop;

import com.stickershop.domain.Member;
import com.stickershop.domain.Product;
import com.stickershop.repository.MemberRepository;
import com.stickershop.repository.ProductRepository;
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

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StickershopApplicationSecurityTests {
	private PasswordEncoder passwordEncoder;

	@Before
	public void setUp() throws Exception {
		passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	@Test
	public void passwordEncoder() throws Exception {
		PasswordEncoder encoder2=new Md4PasswordEncoder();
		System.out.println(encoder2.encode("1234"));

		String encode = passwordEncoder.encode("1234");
		System.out.println(encode);

		boolean matches = passwordEncoder.matches("1234", "{bcrypt}$2a$10$E8iPy5Bz0FC3ro9bmUfx3uVoXdLw4lQnYB4UndyzO751NZqZULpOe");
		Assert.assertTrue(matches);
	}

}
