package com.movie.MovieList.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.MovieList.entity.Reviews;


@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {
	Optional<Reviews> findReviewsById(Long Id);
}