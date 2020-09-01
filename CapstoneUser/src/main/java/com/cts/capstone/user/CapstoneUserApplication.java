package com.cts.capstone.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cts.capstone.user")
public class CapstoneUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneUserApplication.class, args);
	}

}
