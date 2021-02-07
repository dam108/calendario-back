package com.doval.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.googlecode.jmapper.api.JMapperAPI;

@SpringBootApplication
@EnableJpaRepositories
public class CalendarioBackApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CalendarioBackApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CalendarioBackApplication.class);
	}
	
	@Bean
	public JMapperAPI modelJMapperApi() {
		return new JMapperAPI();
	}

}
