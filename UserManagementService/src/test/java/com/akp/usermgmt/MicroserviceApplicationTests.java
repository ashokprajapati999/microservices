package com.akp.usermgmt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("DEV")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

}