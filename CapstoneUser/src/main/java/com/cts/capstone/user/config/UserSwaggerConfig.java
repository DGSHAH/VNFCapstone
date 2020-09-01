package com.cts.capstone.user.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class UserSwaggerConfig {

	 public static final Contact DEFAULT_CONTACT = new Contact("Dipesh Shah", "https://github.com/DGSHAH77", "dipesh.shah07796@gmail.com");
	 public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("USER Api Documentation", "USER Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	 private static final Set<String> DEFUALT_PRODUCE_AND_CONSUMES = 
			 new HashSet<String>(Arrays.asList("application/json","applicatoin/xml"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFUALT_PRODUCE_AND_CONSUMES)
				.consumes(DEFUALT_PRODUCE_AND_CONSUMES);
	}
}
