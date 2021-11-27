package edu.miu.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;

@SpringBootApplication
public class JobSearchApplication {

	static Logger logger = org.slf4j.LoggerFactory.getLogger(JobSearchApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application is started");
	}
		
	public static void main(String[] args) {
		logger.info("Application is running...");
		SpringApplication.run(JobSearchApplication.class, args);
	}

}
