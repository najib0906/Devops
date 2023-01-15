package com.projet.projet.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.projet.entities.Cinema;
import com.projet.projet.entities.Film;
import com.projet.projet.service.IServiceCinema;
import com.projet.projet.service.IServiceFilm;

@RestController
@RequestMapping ("/restapicinema")
@CrossOrigin(origins="http://localhost:4200")
public class CinemaController {
	
	@Autowired 
	IServiceCinema sc;
	
	
	@GetMapping("/all")
	public List<Cinema> getAllFilms(){
	return sc.getAllCinema();
	}

}
