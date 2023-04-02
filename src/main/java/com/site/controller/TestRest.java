package com.site.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

	@GetMapping(value = "/hello")
	private String test() {
		return "hello world!";
	}
}
