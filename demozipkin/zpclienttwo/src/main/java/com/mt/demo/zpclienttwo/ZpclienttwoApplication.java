package com.mt.demo.zpclienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //引入feign支持
@EnableAutoConfiguration //引入自动配置，替代配置文件
public class ZpclienttwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZpclienttwoApplication.class, args);
	}

}
