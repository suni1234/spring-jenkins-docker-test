package com.learn.jenkins.docker.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDockerTestApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockerTestApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case execusting");
		logger.info("Test case execustingthiredstatement");
		assertEquals(true, true);
	}
}
