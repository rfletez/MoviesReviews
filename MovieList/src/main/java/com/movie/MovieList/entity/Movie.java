package com.movie.MovieList.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "imdb_id")
	@NotNull(message = "imdb Id cannot be null")
	@NotEmpty(message = "imdb Id cannot be empty")
	@Size(min = 3, max = 40, message = "imdb ID must be between 3 and 40 characters long")
	private String imdbId;
	
	@Column(name = "title")
	@NotNull(message = "Title cannot be null")
	@NotEmpty(message = "Title cannot be empty")
	@Size(min = 3, max = 40, message = "Title must be between 3 and 40 characters long")
	private String title;
	
	@Column(name = "release_date")
	@NotNull(message = "Release Date cannot be null")
	@NotEmpty(message = "Release Date cannot be empty")
	@Size(min = 3, max = 40, message = "Title must be between 3 and 40 characters long")
	private String releaseDate;
	
	@Column(name = "trailer_link")
	@NotNull(message = "Trailer Link cannot be null")
	@NotEmpty(message = "Trailer Link cannot be empty")
	private String trailerLink;
	
	@Column(name = "poster")
	@NotNull(message = "Poster cannot be null")
	@NotEmpty(message = "Poster cannot be empty")
	@Size(min = 3, max = 40, message = "Poster must be between 3 and 40 characters long")
	private String poster;
	
	@Column(name = "genres")
	private List<String> genres;
	
	@Column(name = "back_drops")
	private List<String> backdrops;
	
	@Column(name = "reviews_ids")
	@OneToMany
	private List<Reviews> reviewIds;
	
	
	public Movie() {}

	public Movie(Long id, String imdbId, String title, String releaseDate, 
			String trailerLink, String poster, List<String> genres, List<String> backdrops) {
		super();
		this.id = id;
		this.imdbId = imdbId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.trailerLink = trailerLink;
		this.poster = poster;
		this.genres = genres;
		this.backdrops = backdrops;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTrailerLink() {
		return trailerLink;
	}
	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getBackdrops() {
		return backdrops;
	}
	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}

	public List<Reviews> getReviewIds() {
		return reviewIds;
	}
	public void setReviewIds(List<Reviews> reviewIds) {
		this.reviewIds = reviewIds;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", imdbId=" + imdbId + ", title=" + title + ", releaseDate=" + releaseDate
				+ ", trailerLink=" + trailerLink + ", poster=" + poster + ", genres=" + genres + ", backdrops="
				+ backdrops + "]";
	}
	
}