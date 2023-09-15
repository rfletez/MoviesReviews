package com.movie.MovieList.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.MovieList.entity.Reviews;
import com.movie.MovieList.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepo;
	
	public Reviews createReview(String reviewBody, String imdbId) {
		Reviews review = null;
		
		Optional<Reviews> reviewsFromImdb = reviewRepo.findReviewsByImdbId(imdbId);
		
		if(reviewsFromImdb.isPresent()) {
			reviewsFromImdb.get().setBody(reviewBody);
			review = new Reviews(reviewBody);
		}
		
		reviewRepo.save(review);
		
		return review;
	}
}