package cn.zwqh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerBApplication.class, args);
	}

}
