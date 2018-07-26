package com.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuDeneme {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
