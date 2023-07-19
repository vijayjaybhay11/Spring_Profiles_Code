package com.springprofile.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

//	@Value("${sentence.text.number}")
//	 private String sent;
//	
//	@Value("${commondata}")
//	private String commondata;
//	
//	@Value("${sentence.text.word}")
//	private String word;
	
	
	@GetMapping("/welcome/{name}")
	 public ResponseEntity<String> getsent(@PathVariable String name){
		 return ResponseEntity.ok("Hi "+name+" , Welcome to Vijay's Deployed website API !");
	 }
}
