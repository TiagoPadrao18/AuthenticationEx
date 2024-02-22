package com.authorizationEx.authorzationEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.authorizationEx.authorzationEx.model")
public class AuthorzationExApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorzationExApplication.class, args);
	}

}
