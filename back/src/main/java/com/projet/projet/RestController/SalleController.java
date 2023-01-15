package com.projet.projet.RestController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.projet.entities.Salle;
import com.projet.projet.service.IServiceSalle;

@RestController
@RequestMapping ("/restapiSalle")
@CrossOrigin(origins="http://localhost:4200")

public class SalleController {
	
	@Autowired 
	IServiceSalle ss;
	

	@GetMapping("/all")
	public List<Salle> getAllSalles(){
	return ss.getAllSalles();
	}

	/*
	@PostMapping("/add")
	public void saveSalle(@RequestBody Salle s) throws IOException{
		ss.saveSalle(s);
		
	}

	@DeleteMapping("/delete/{id}")
	public void deletesalle(@PathVariable int id) throws IOException{
		ss.supprimerSalle(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody Salle s) throws IOException {
		saveSalle(s);
	}
	*/


}
