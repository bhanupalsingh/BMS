package com.bms.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bms.constants.Address;
import com.bms.constants.SeatStatus;
import com.bms.manager.bmsManager;
import com.bms.model.Cinema;
import com.bms.model.CinemaHall;
import com.bms.model.City;
import com.bms.model.Movie;
import com.bms.model.Seat;
import com.bms.model.Show;

public class AdminService {
	private bmsManager bms = bmsManager.getinstance();
	SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

	public void addMovie(String name, String descripiton, String genre, Date releaseDate) {
		Movie movie = new Movie(name, descripiton, genre, releaseDate);
		bms.addMovie(movie);
	}

	public void addCity(String name, String state, String zipcode) {
		City city = new City(name, state, zipcode);
		bms.addCity(city);
	}

	public void addCinema(String address, String zipcode, String city, String state, String name) {
		City cityObject = new City(city,state,zipcode);
		Address add = new Address(address, cityObject);
		Cinema cinema = new Cinema(add, name);
		bms.addCinema(cinema);
	}

	public void addCinemaHall(int cinemaId, int noOfCinema) {
		Cinema cinema = bms.getCinema(cinemaId);
		for (int i = 0; i < noOfCinema; i++) {
			CinemaHall cinemaHall = new CinemaHall(cinema);
			List<Seat> seats = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					Seat seat = new Seat(j, k, SeatStatus.FREE);
					seats.add(seat);
				}
			}
			cinemaHall.setSeats(seats);
			bms.addCinemaHall(cinemaHall, cinema);
		}
	}

	public void addShow(String startDate , String endDate , int mid , int cid, int chid ) {
		//String sDate6 = "31-Dec-1998 23:37:50";  
		Date start;
		try {
			start = formatter6.parse(startDate);
			Date end = formatter6.parse(endDate);
			Cinema cinema = bms.getCinema(cid);
			Movie movie = bms.getMovie(mid);
			List<CinemaHall> cinemaHall = bms.getCinemaHallByCinema(cinema);
			CinemaHall cinemaHall1 = cinemaHall.get(chid);
			Show show = new Show( start ,end , cinemaHall1 , movie);
			bms.addShow(show);
		} catch (ParseException e) {
			e.printStackTrace();
		}   
	}

}
