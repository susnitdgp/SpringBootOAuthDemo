package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringBootOAuthDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuthDemo.class, args);
	}
	
	@GetMapping("/")
	public String getName(Principal principal) {
		
		return "Hello " + principal.getName() + "!";
	}

}
