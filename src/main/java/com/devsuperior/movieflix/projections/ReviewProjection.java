package com.devsuperior.movieflix.projections;

public interface ReviewProjection {
	
	Long getId();

	String getText();

	Long getMovieId();

	Long getUserId();

	String getName();

	String getEmail();

}
