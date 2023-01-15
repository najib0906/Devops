package com.projet.projet.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.projet.dao.FilmRepository;
import com.projet.projet.dao.SalleRepository;
import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceSalle implements IServiceSalle {
	@Autowired
	SalleRepository sr ;
	@Autowired
	FilmRepository fr;
	
/*
	@Override
	public void saveSalle(Salle s) throws IOException {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}
*/
	@Override
	public List<Salle> getAllSalles() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Salle getSalle(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public List<Salle> getSallesByMC(String mc) {
		// TODO Auto-generated method stub
		return sr.findByNomContains(mc); 
	}

	@Override
	public void supprimerSalle(int id) {
		// TODO Auto-generated method stub
		
		sr.deleteById(id);	
	}

	@Override
	public void filmsalle(Salle s, Film f) {

		s.getFilm().add(f);
		fr.save(f);
		
	}

	@Override
	public void saveSalle(Salle s) throws IOException {

		sr.save(s)	;
	}
	public void annuleSalleFilm(int idp, int idf) {
		// TODO Auto-generated method stub
		
		Film film=fr.findById(idf).get();
		int nombreSalle = film.getSalle().size();
		for(int i = 0; i < nombreSalle; i++){
			if(film.getSalle().get(i).getId() == idp){
				film.getSalle().remove(i);
				fr.save(film);
				
			}
		}
}
}