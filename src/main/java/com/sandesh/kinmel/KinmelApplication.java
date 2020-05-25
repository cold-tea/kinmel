package com.sandesh.kinmel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class KinmelApplication {

	public static void main(String[] args) {
		SpringApplication.run(KinmelApplication.class, args);
	}

}
