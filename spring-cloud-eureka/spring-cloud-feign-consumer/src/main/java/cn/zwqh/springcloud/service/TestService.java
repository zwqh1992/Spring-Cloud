package cn.zwqh.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-eureka-service")
public interface TestService {

	@RequestMapping("/test")
	public String test();
}
