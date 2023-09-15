package com.movie.MovieList.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "body")
	@NotNull(message = "Body cannot be null")
	@NotEmpty(message = "Body cannot be empty")
	private String body;
	
	
	public Reviews() {}

	public Reviews(Long id, String body) {
		super();
		this.id = id;
		this.body = body;
	}
	
	public Reviews(String body) {
		this.body = body;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", body=" + body + "]";
	}
	
}