package io.ytong.smoketest.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.ytong.service.Service;

@Category(io.ytong.test.annotation.SmokeTest.class)
public class SmokeTest {
	
	//  mvn failsafe:integration-test@smoke-test
	@Test
	public void testHealth() {
		assertEquals(true, new Service().isHealth());
	}
}
