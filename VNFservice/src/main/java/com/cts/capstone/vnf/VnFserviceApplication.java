package com.cts.capstone.vnf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cts.capstone.vnf")
public class VnFserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VnFserviceApplication.class, args);
	}

}
