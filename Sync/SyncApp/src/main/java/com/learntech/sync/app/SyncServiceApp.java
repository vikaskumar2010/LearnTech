package com.learntech.sync.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learntech.sync.*")
public class SyncServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(SyncServiceApp.class, args);
	}
}
