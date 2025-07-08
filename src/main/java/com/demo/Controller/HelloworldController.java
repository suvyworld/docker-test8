package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello From Suvy-Wrold";
	}

}
