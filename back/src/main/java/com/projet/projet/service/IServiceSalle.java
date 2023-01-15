package com.projet.projet.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;

public interface IServiceSalle {
	
	 void saveSalle(Salle s) throws IOException;
	  List<Salle> getAllSalles();
	  Salle getSalle(int id);
	  List<Salle> getSallesByMC(String mc);
	  void supprimerSalle(int id);
	  void filmsalle(Salle s, Film f);
	  void annuleSalleFilm(int idp, int idc) ;

}
