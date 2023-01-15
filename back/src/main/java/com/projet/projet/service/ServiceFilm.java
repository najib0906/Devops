package com.projet.projet.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.projet.projet.dao.FilmRepository;
import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ServiceFilm implements IServiceFilm {

	@Autowired
	FilmRepository fr;//injection de dependeance
	

	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}

	@Override
	public Film getFilms(int id) {
		// TODO Auto-generated method stub
		return  fr.findById(id).get();
	}

	/*@Override
	public List<Film> getFilmsByMC(String mc) {
		// TODO Auto-generated method stub
		return fr.findByContains(mc);
	}*/

	@Override
	public void supprimerFilms(int id) {
		// TODO Auto-generated method stub
		fr.deleteById(id);
	}

	@Override
	public List<Film> getFilmsByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public byte[] getImage(int id) throws IOException {
		// TODO Auto-generated method stub
		String nomImage=fr.findById(id).get().getPhoto();
				Path p=Paths.get(System.getProperty("user.dir") + "/src/main/webapp/imagesdata",nomImage);
				
				return Files.readAllBytes(p);
	}

	@Override
	public void supprimerImage(Integer idProduit) throws IOException {

Film f =fr.getById(idProduit);
		
		String chemin =System.getProperty("user.dir")+"/src/main/webapp/imagesdata/";
		Path p=Paths.get(chemin,f.getPhoto());
		Files.delete(p);	
	}

	@Override
	public String saveImage(MultipartFile mf) throws IOException {

		String nameFile = mf.getOriginalFilename();
		String tab[] = nameFile.split("\\.");
		String fileModif = tab[0] +"_"+ System.currentTimeMillis()+"."+tab[1];
		String chemin = System.getProperty("user.dir")+"/src/main/webapp/imagesdata/";
		Path p = Paths.get(chemin, fileModif);
		Files.write(p,mf.getBytes());
		return fileModif;
	}

	@Override
	public void saveFilm(Film f, MultipartFile mf) throws IOException {

		String photo;
		if(!mf.getOriginalFilename().equals(""))
		{
			photo=saveImage(mf);
			f.setPhoto(photo);
		
		}
		fr.save(f);	
				
	}
	
	
	public List<Film> getBySalle(Salle salle) {
		// TODO Auto-generated method stub
		return fr.findBySalle(salle);
	}
	
	/*
	@Override
	public String saveImage(MultipartFile mf) throws IOException {
		// TODO Auto-generated method stub
		String nameFile = mf.getOriginalFilename();
		String tab[] =nameFile.split("\\.");
		String fileModif=tab[0]+"_"+System.currentTimeMillis()+"."+tab[1];
		String chemin =System.getProperty("user.home")+"/imagesdata/";
		Path p = Paths.get(chemin,fileModif);
		Files.write(p,mf.getBytes());
		return fileModif;
	}

	@Override
	public byte[] getImage(int id) throws IOException {
		// TODO Auto-generated method stub
		String nomImage=fr.findById(id).get().getPhoto();
		Path p = Paths.get(System.getProperty("user.home")+"/imagesdata/",nomImage);
		return Files.readAllBytes(p);
	}
	*/

}
