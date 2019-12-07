package cn.zwqh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
public class SpringCloudFeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignConsumerApplication.class, args);
	}

}
