package com.projet.projet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;
@Repository
public interface SalleRepository extends JpaRepository<Salle, Integer> {
	List<Salle> findByNomContains(String mc);
//	List<Salle> findByFilms(Film idc);
	

}
