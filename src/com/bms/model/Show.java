package com.bms.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Show {
	private int id;
	private Date startTime;
	private Date endTime;
	private CinemaHall cinemaHall;
	private Movie movie;
	
	private static AtomicInteger ao = new AtomicInteger(0);
	
	
	public Show(Date startTime, Date endTime, CinemaHall cinemaHall, Movie movie) {
		this.setId();
		this.startTime = startTime;
		this.endTime = endTime;
		this.cinemaHall = cinemaHall;
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = ao.incrementAndGet();
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
	
	
	
	
}
