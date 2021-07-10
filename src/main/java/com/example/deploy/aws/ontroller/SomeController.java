package com.example.deploy.aws.ontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class SomeController {
	
	@GetMapping(value = "/hello")
	public String sayHelloToAws() {
		return "Hello Saibal welcome to AWS!!";
	}

}
