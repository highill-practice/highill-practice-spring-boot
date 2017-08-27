package com.highill.practice.spring.boot.service;

import org.springframework.transaction.annotation.Transactional;

public class DemoService {
	
	
	@Transactional
	public String demo() {
		String demo = "demo";
		return demo;
	}

}
