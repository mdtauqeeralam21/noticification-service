package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.pms.exception.GlobalExceptionHandler;

@SpringBootApplication
//@EnableDiscoveryClient
@Import(GlobalExceptionHandler.class)
public class G2NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(G2NotificationServiceApplication.class, args);
	}

}
