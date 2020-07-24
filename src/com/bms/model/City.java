package com.bms.model;

import java.util.concurrent.atomic.AtomicInteger;

public class City {
	private int id;
	private String name;
	private String state;
	private String zipcode;
	private static AtomicInteger ao = new AtomicInteger(0);
	
	
	public City(String name, String state, String zipcode) {
		this.setId();
		this.name = name;
		this.state = state;
		this.zipcode = zipcode;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ao.incrementAndGet();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
