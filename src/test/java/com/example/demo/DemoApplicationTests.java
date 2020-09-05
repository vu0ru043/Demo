package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Test");
	}

	@Test
	public void test() throws Exception {
		int num = 1;
		Assert.assertEquals(num, 1);
	}
}
