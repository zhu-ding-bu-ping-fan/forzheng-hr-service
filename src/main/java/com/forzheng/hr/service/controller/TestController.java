package com.forzheng.hr.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@Value("${server.port}")
	String port;
	@RequestMapping(value="/getHi")
	public String getHi(String name){
		return "hi "+name+",i am from port:" +port;
	}
	
}
