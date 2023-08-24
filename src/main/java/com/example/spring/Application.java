package com.example.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		final ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(LOG::info);
	}

}
