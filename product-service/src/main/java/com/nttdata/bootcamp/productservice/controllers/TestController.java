package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping(value = "/port")
	public String getPort() {
		return "El puerto es el " + port;
	}
}
