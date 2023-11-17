package org.aadi.demoschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.aadi.demoschool.repository")
@EntityScan("org.aadi.demoschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class MyDemoSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoSchoolApplication.class, args);
	}

}
