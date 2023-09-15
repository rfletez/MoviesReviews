package com.movie.MovieList.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.MovieList.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	Optional<Movie> findMovieByImdbId(String imdbId);
	
}