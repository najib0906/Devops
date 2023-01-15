package com.projet.projet.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;


public interface IServiceFilm {
	
	void saveFilm(@RequestBody Film f,MultipartFile mf) throws IOException;
	  List<Film> getAllFilms();
	  Film getFilms(int id);
	  List<Film> getFilmsByMC(String mc);
	  void supprimerFilms(int id);
	  public byte[] getImage(int id) throws IOException;
	  void supprimerImage(Integer idProduit) throws IOException;
	  String saveImage(MultipartFile mf)throws IOException ;
	  List<Film> getBySalle(Salle salle);


}
