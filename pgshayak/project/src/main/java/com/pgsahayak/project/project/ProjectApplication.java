package com.pgsahayak.project.project;

import com.pgsahayak.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		User user=new User();
		System.out.println(user.getId());
	}

}
