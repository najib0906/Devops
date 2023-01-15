package com.projet.projet.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import com.projet.projet.dao.CinemaRepository;
import com.projet.projet.entities.Cinema;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ServiceCinema implements IServiceCinema {
 
	CinemaRepository cr ;
	@Override
	public void save(Cinema c) throws IOException {
		// TODO Auto-generated method stub
		cr.save(c);
		
		
	}

	@Override
	public List<Cinema> getAllCinema() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Cinema getCinema(int id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public List<Cinema> getCinemaByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCinema(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		
	}

}
