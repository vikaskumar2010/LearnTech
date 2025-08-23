package com.learntech.sync.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.learntech.sync")
@EnableJpaRepositories(basePackages = "com.learntech.sync")
@EntityScan(basePackages = "com.learntech.sync.model.entities")
public class SyncServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(SyncServiceApp.class, args);
	}
}
