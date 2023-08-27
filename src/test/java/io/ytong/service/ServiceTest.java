package io.ytong.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceTest {
	
	private String serviceName = "foo";
	
	@Test
	public void testGetServiceName() {
		assertEquals(serviceName, new Service().getServiceName());
	}
	
}
