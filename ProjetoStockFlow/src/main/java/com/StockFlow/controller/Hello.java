package com.StockFlow.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

	@GetMapping("/hello")
	public String hello() {
		return "Olá mundo Spring, "+new Date();
	}
}