package com.microServiceConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableFeignClients
public class MicroServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceConsumerApplication.class, args);
	}
}
