package com.bms.constants;

import java.util.concurrent.atomic.AtomicInteger;

import com.bms.model.City;

public class Address {
	private int id;
	private String address;
	private City city;
	
	
	
	
	private static AtomicInteger ao = new AtomicInteger(0);
	
	
	
	
	public Address(String address, City city) {
		this.setId();
		this.address = address;
		this.city = city;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ao.incrementAndGet();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
