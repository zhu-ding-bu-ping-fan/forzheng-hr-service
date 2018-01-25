package com.forzheng.hr.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ForzhengHrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForzhengHrServiceApplication.class, args);
		System.out.println("forzheng-hr-service:启动完成");
	}
}
