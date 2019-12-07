package cn.zwqh.springcloud.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private final Logger logger=Logger.getLogger(getClass());
	
	
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return "test success";
	}
}
