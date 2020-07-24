package com.bms.service;

import java.util.List;

import com.bms.manager.bmsManager;
import com.bms.model.City;
import com.bms.model.Movie;

public class CommonService {
	private bmsManager bms = bmsManager.getinstance();
	
	public void searchCity() {
		List<City> cities = bms.getAllCity();
		for(City city : cities) {
			System.out.println(city.getId() + " "+city.getName());
		}
	}
	
	public void searchMovieInCity(int cityId) {
		List<Movie> movies = bms.getMovieBasedOnCity( cityId);
		for(Movie movie:movies) {
			System.out.println(movie.getId()+" "+movie.getName());
		}
	}
}
