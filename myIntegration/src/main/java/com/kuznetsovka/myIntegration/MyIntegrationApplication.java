package com.kuznetsovka.myIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

@SpringBootApplication
public class MyIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication (MyIntegrationApplication.class);
		app.setDefaultProperties (Collections.singletonMap ("server.port", "8095"));
		ConfigurableApplicationContext context = app.run (args);
	}
}
