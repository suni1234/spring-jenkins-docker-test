package com.learn.jenkins.docker.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDockerTestApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockerTestApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerTestApplication.class, args);
	}

}
