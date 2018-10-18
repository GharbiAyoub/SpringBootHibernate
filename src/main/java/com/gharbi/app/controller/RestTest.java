package com.gharbi.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

	@GetMapping("/test")
	public String getCustomers() {
		return "Ce ci de test.....";
	}
}
