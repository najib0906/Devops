package com.projet.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.projet.entities.Cinema;
@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {

}
