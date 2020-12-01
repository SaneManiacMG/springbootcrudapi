package com.mg.springboot.springbootcrud.springbootcrudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableAutoConfiguration

@ComponentScan(basePackages="com.mg.springboot.springbootcrud.springbootcrudapi")

@EnableJpaRepositories("com.mg.springbootcrud.springbootcrudapi.dao")
public class SpringbootcrudapiApplication  extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudapiApplication.class, args);
	}

}
