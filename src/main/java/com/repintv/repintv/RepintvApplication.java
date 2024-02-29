package com.repintv.repintv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RepintvApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepintvApplication.class, args);
	}

}
