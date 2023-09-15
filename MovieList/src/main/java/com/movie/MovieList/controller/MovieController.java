package com.movie.MovieList.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.MovieList.entity.Movie;
import com.movie.MovieList.exception.MovieNotFoundException;
import com.movie.MovieList.service.MovieService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Movie>> getMovieByID(@PathVariable("id") Long id) throws MovieNotFoundException {
		Optional<Movie> getMovie = movieService.getMovieByID(id);
		
		return new ResponseEntity<Optional<Movie>>(getMovie, HttpStatus.OK);
	}
	
}