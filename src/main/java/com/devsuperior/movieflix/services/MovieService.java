package com.devsuperior.movieflix.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieCardDTO;
import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.projections.MovieProjection;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MovieCardDTO> findByGenre(Long genreId, Pageable pageable) {
		List<Long> id = new ArrayList<>();
		if (!(genreId == 0L)) {
			id.add(genreId);
		}
		Page<MovieProjection> result = repository.searchByGenre(id, pageable);
		return result.map(x -> new MovieCardDTO(x));
	}

	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id) {
		Movie movie = repository.searchMovieWithGenre(id)
				.orElseThrow(() -> new ResourceNotFoundException("Id Não Encontrado"));
		return new MovieDetailsDTO(movie);
	}
}
