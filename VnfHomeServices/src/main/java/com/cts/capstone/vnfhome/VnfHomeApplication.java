package com.cts.capstone.vnfhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cts.capstone.vnfhome")
public class VnfHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VnfHomeApplication.class, args);
	}

}
