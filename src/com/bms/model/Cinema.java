package com.bms.model;

import java.util.concurrent.atomic.AtomicInteger;

import com.bms.constants.Address;

public class Cinema {
	private int id;
	private Address address;
	private String name;
	
	
	private static AtomicInteger ao = new AtomicInteger(0);

	
	public Cinema(Address address, String name) {
		this.setId();
		this.address = address;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ao.incrementAndGet();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
