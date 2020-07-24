package com.bms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CinemaHall {
	private int id;
	private List<Seat> seats;
	private Cinema cinema;
	
	private static AtomicInteger ao = new AtomicInteger(0);

	
	
	
	public CinemaHall(Cinema cinema) {
		this.setId();
		this.seats = new ArrayList<>();
		this.cinema = cinema;
	}
	
	
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ao.incrementAndGet();
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
		
}
