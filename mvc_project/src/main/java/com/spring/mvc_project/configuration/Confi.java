package com.spring.mvc_project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Confi {
	
	@Bean
	public RestTemplate rests() {
		return new RestTemplate();
	}

}
