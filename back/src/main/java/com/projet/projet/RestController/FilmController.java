package com.projet.projet.RestController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projet.projet.entities.Film;
import com.projet.projet.service.IServiceFilm;

@RestController
@RequestMapping ("/restapifilm")
@CrossOrigin(origins="http://localhost:4200")
public class FilmController {
	
	@Autowired 
	IServiceFilm sf;

	
	@GetMapping("/all")
	public List<Film> getAllFilms(){
	return sf.getAllFilms();
	}

	
	/*
	@PostMapping("/add")
	public void saveFilm (@RequestBody Film f) throws IOException{
	sf.saveFilm(f, null);
		
	}
	*/

	/*
	@DeleteMapping("/delete/{id}")
	public void deletefilm(@PathVariable int id) throws IOException{
		sf.supprimerFilms(id);
	}
	*/

	/*
	@PutMapping("/update")
	public void update(@RequestBody Film f) throws IOException {
		saveFilm(f);
	}
	*/
	@GetMapping(path = "/getImageFilms/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@PathVariable("id") int id) throws IOException {
		return sf.getImage(id);
	}

}
