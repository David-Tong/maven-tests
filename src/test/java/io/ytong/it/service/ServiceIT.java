package io.ytong.it.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.ytong.service.Service;

public class ServiceIT {
	private String serviceClassName = "io.ytong.service.Service";
	
	@Test
	public void testGetServiceName() {
		assertEquals(serviceClassName, new Service().getServiceClassName());
	}
}
