package com.movie.MovieList.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.MovieList.entity.Movie;
import com.movie.MovieList.entity.Reviews;
import com.movie.MovieList.service.ReviewService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:3007")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/{id}")
	public Optional<Reviews> getReviewById(Long id) {
		return reviewService.getReviewById(id);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Reviews> createReview(@Valid @RequestBody Reviews reviewObj, @PathVariable("id") Long id) {
		return new ResponseEntity<Reviews>(reviewService.createReview(reviewObj.getBody(), id), HttpStatus.CREATED);
	}

}