package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class csecontrollers {
	@GetMapping("/adityaCse")
	public String rocks() {
		return "Welcome to adityaCse";
	}
	
	@GetMapping("/adityait")
	public String rocks1() {
		return "Welcome to adityait";
	}

}
