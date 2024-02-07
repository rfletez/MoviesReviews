package com.movie.MovieList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class MovieListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieListApplication.class, args);
	}

}