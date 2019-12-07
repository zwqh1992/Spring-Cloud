package cn.zwqh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.zwqh.springcloud.service.TestService;

@RestController
public class ConsumerController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
	public String test() {
		return testService.test();
	}
}
