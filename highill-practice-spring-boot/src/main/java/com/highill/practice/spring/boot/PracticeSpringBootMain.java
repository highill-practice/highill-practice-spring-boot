package com.highill.practice.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class PracticeSpringBootMain {
	
	final static Logger log = LoggerFactory.getLogger(PracticeSpringBootMain.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext configApplicationContext = SpringApplication.run(PracticeSpringBootMain.class, args);
		int beanCount = configApplicationContext.getBeanDefinitionCount();
		log.info("-----beanCount:{} ", beanCount);
	}

}
