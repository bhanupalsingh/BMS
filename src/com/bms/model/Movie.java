package com.bms.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Movie {
	private int id;
	private String name;
	private String description;
	private String genre;
	private Date releaseDate;
	
	private static AtomicInteger ao = new AtomicInteger(0);

	
	
	public Movie(String name, String description, String genre, Date releaseDate) {
		this.setId();
		this.name = name;
		this.description = description;
		this.genre = genre;
		this.releaseDate = releaseDate;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	
}
