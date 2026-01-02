package com.telusko.demo;

import com.telusko.demo.model.Alien;
import com.telusko.demo.repository.AlienDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");


		AlienDao repo = context.getBean(AlienDao.class);
		repo.save(alien1);
		System.out.println(repo.findAll());
	}

}
