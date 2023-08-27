package io.ytong.service;

public class Service {
	
	private String serviceName = "foo";
	
	public String getServiceName() {
		return serviceName;
	}

	public String getServiceClassName() {
		return this.getClass().getName();
	}
	
	public boolean isHealth() {
		return true;
	}
}
