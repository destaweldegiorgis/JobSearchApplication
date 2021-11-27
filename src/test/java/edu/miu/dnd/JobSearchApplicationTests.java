package edu.miu.dnd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JobSearchApplicationTests {

	public static Logger logger = org.slf4j.LoggerFactory.getLogger(JobSearchApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executed ....");
		assertEquals(true, true);
	}

}
