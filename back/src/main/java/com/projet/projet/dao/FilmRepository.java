package com.projet.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;

@Repository

public interface FilmRepository extends JpaRepository<Film, Integer>{

	//List<Film> findBySalle(Salle idc);
	//List<Film> findByContains(String mc);
	List<Film> findBySalle(Salle idc);
}
