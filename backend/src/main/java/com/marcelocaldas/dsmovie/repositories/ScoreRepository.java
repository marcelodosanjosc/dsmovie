package com.marcelocaldas.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocaldas.dsmovie.entities.Score;
import com.marcelocaldas.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
