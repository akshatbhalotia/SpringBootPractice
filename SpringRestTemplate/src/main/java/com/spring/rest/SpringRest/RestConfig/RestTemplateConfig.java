package com.spring.rest.SpringRest.RestConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	public RestTemplate restTemplateConfig() {
		return new RestTemplate();
	}
	
	

}
