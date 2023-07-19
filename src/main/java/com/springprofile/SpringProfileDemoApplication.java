package com.springprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringProfileDemoApplication {

	@Value("${datasource.url}")
	private static String sent;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileDemoApplication.class, args);
		System.out.println("Application is running !");
		 
		
	}

}
