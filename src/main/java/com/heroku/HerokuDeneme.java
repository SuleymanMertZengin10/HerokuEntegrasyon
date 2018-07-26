package com.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuDeneme {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/deneme")
	public String deneme() {
		
		return "deneme";
	}
	@RequestMapping("/deneme2")
	public String deneme2() {
		
		return "deneme2";
	}
}
