package com.bms.manager;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import com.bms.model.Cinema;
import com.bms.model.CinemaHall;
import com.bms.model.City;
import com.bms.model.Movie;
import com.bms.model.Seat;
import com.bms.model.Show;

public class bmsManager {
	private Hashtable<Integer, City> cities;
	private Hashtable<Integer, Cinema> cinemas; 
	private Hashtable<Integer, List<CinemaHall>> cinemaHallByCinema;
	private Hashtable<Integer , List<Seat>> seatsForCinemaHall;
	private Hashtable<Integer, Movie> movies;
	private Hashtable<Integer , Show> shows;
	
	private static bmsManager bms = null;
	public bmsManager() {
		cities = new Hashtable<>();
		cinemas = new Hashtable<>();
		cinemaHallByCinema = new Hashtable<>();
		seatsForCinemaHall = new Hashtable<>();
		movies = new Hashtable<>();
		shows = new Hashtable<>();
	}
	
	public static bmsManager getinstance() {
		if(bms == null) {
			bms = new bmsManager();
		}
		
		return bms;
	}
	
	
	
	public void addCity(City city) {
		cities.put(city.getId(), city);
	}
	
	public void addMovie(Movie movie) {
		movies.put(movie.getId(),movie);
	}
	
	public void addCinema(Cinema cinema) {
		cinemas.put(cinema.getId(),cinema);
	}
	
	public void addCinemaHall(CinemaHall cinemaHall , Cinema cinema) {
		cinemaHallByCinema.get(cinema.getId()).add(cinemaHall);
	}
	
	public void addShow(Show show) {
		shows.put(show.getId(), show);
	}
	
	
	
	public List<City> getAllCity(){
		List<City> city = new ArrayList<City>();
		for(Entry<Integer, City> eachCity  : cities.entrySet()) {
			city.add(eachCity.getValue());
		}
		return city;
	}
	
	
	

	
	public List<CinemaHall> getCinemaHallByCinema(Cinema cinema){
		return cinemaHallByCinema.get(cinema.getId());
	}
	
	public List<Seat> getAllSeats(CinemaHall cinemaHall){
		return seatsForCinemaHall.get(cinemaHall.getId());
	}
	
	public Cinema getCinema(int id) {
		return cinemas.get(id);
	}
	
	public Movie getMovie(int id) {
		return movies.get(id);
	}
	
	public List<Movie> getMovieBasedOnCity(int cityId){
		
		List<Cinema> cinemaList = new ArrayList<Cinema>();
		City city = cities.get(cityId);
		
		return null;
	}
	
	
}
