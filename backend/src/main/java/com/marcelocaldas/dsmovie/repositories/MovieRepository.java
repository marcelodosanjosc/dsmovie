package com.marcelocaldas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocaldas.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}
