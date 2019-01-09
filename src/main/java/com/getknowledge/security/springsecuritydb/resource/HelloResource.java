package com.getknowledge.security.springsecuritydb.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@GetMapping("/all")
	public String hello() {
		
		return "Hello All";
	}
	
	@GetMapping("secured/all")
	public String securedHello() {
		
		return "Hello Secured All";
	}
}
