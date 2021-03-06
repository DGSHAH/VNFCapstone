package com.cts.capstone.vnf.config;

import java.util.Set;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class VNFServiceSwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact("PRANITH GADAPA", "pranith.gadapa@cognizant.com", "pranith.gadapa@cognizant.com");
	private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("VNFService Api Documentation", "VNFService Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static final Set<String> DEFAULT_PRODUCE_AND_CONSUME = null;

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCE_AND_CONSUME)
				.consumes(DEFAULT_PRODUCE_AND_CONSUME);
	}
}
