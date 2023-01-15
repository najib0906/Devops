package com.projet.projet.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.projet.projet.entities.Cinema;
public interface IServiceCinema {
	 void save(Cinema c) throws IOException;
	  List<Cinema> getAllCinema();
	  Cinema getCinema(int id);
	  List<Cinema> getCinemaByMC(String mc);
	  void supprimerCinema(int id);

}
