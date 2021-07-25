package one.digitalinnovation.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/sayHello")
public class SayHello {

	@GetMapping
	public String message() {
		return "Hello user!";
	}
	
}
