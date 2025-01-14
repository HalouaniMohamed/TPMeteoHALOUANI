package com.example.halouani_mohamed_tp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HalouaniMohamedTp3Application {
	@Bean
	public org.springframework.web.client.RestTemplate restTemplate() {
		return new org.springframework.web.client.RestTemplate();
	}


		public static void main(String[] args) {
		SpringApplication.run(HalouaniMohamedTp3Application.class, args);
	}

}
