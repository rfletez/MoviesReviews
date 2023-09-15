package com.movie.MovieList.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.MovieList.entity.Movie;
import com.movie.MovieList.exception.MovieNotFoundException;
import com.movie.MovieList.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}
	
	public Optional<Movie> getMovieByID(Long id) throws MovieNotFoundException {
		Optional<Movie> movie = movieRepo.findById(id);
		
		if(movie.isEmpty() || movie == null) {
			throw new MovieNotFoundException("Movie cannot be found with id: " + id);
		}
		
		return movie;
	}
	
	public Optional<Movie> getMovieByImdbID(String imdbId) {
		return movieRepo.findMovieByImdbId(imdbId);
	}
	
}