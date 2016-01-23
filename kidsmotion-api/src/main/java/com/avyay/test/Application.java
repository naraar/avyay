package com.avyay.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.avyay.entity.User;
import com.avyay.repo.UserRepo;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new ClassPathResource("persistence-config.xml").getPath());
		UserRepo userRepo = context.getBean(UserRepo.class);

		User user = new User();
		user.setFirstName("Tst First");
		user.setLastName("testLast");
		user.setPassword("testPass");
		user.setProfileName("testProfile");
		user.setUserName("testUserName");

		userRepo.save(user);
		context.close();

	}
}
