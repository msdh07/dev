package com.sadham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceApplication {
	
	@GetMapping("/hi")
	public String home()
	{
		
		return "Hello";
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
