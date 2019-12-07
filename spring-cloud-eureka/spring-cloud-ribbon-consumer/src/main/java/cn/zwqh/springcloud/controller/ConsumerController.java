package cn.zwqh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/test")
	public String test() {
		return restTemplate.getForEntity("http://spring-cloud-eureka-service/test", String.class).getBody();
	}
}
