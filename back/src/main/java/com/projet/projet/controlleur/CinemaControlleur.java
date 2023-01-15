package com.projet.projet.controlleur;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.projet.projet.entities.Cinema;
import com.projet.projet.entities.Film;
import com.projet.projet.entities.Salle;
import com.projet.projet.service.IServiceCinema;
import com.projet.projet.service.IServiceFilm;
import com.projet.projet.service.IServiceSalle;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/cinema")
@AllArgsConstructor
public class CinemaControlleur {
	@Autowired
	IServiceCinema sc;
	@Autowired
	IServiceFilm sf;
	@Autowired
	IServiceSalle ss;
	@GetMapping("/cinemamc")
	public String Produitmc(@RequestParam String mc , Model m) {
		List<Cinema>liste=sc.getCinemaByMC(mc); 
		m.addAttribute("cinemas",liste);
		return "listeCinema";
	}
	@GetMapping("/supprimercinema/{id}")
	public String supprimerCinema(@PathVariable int id ) {
		sc.supprimerCinema(id);
		return "redirect:/cinema/allcinema";
	}
	@GetMapping("/ajoutercinema")
	public String ajoutCinema(Model m) {
		return "ajouterCinema";
	}
	@PostMapping("/savecinema")
	public String saveProduit (@ModelAttribute Cinema c ,Model m )throws IOException  {
		Integer id =c.getId();
		sc.save(c);
		if(id!=null) {
			return "redirect:/cinema/allcinema";
		}
		else
		{
			m.addAttribute("message","Ajout Avec succes");
			return "ajouterCinema";
		}
	
	}
	@GetMapping("/modifiercinema/{idp}")
	public String modifierCinema(Model m,@PathVariable("idp") int id) {
		m.addAttribute("cinemas",sc.getCinema(id));
		return "ajouterCinema";
		
	}
	
	
	@GetMapping("/allcinema")
	public String getAllCinema(Model m)
	{
		List<Cinema>liste=sc.getAllCinema();
		m.addAttribute("cinemas",liste);
		return "listeCinema";
	}
	
	
	
	
	
	
	
	
	@GetMapping("/filmmc")
	public String filmmc(@RequestParam String mc , Model m) {
		List<Film>liste=sf.getFilmsByMC(mc);
		m.addAttribute("films",liste);
		return "listeFilm";
	}
	@GetMapping("/supprimerfilm/{id}")
	public String suprrimerFilm(@PathVariable int id ) {
		sf.supprimerFilms(id);
		return "redirect:/cinema/allfilm";
	}
	@GetMapping("/ajouterfilm")
	public String ajouterFilm(Model m) {
		
		return "ajouterFilm";
	}
	@PostMapping("/savefilm")
	public String saveFilm(@ModelAttribute Film f,@RequestParam("file") MultipartFile mf,Model m) throws IOException
	  {
		  Integer id=f.getId();
		  sf.saveFilm(f, mf);
		 
		  if(id!=null) // modification
		  {
			  return"redirect:/cinema/allfilm";
		  }
		  else // ajouter
		  {
			  m.addAttribute("message", "ajouter avec suceés");
			 // m.addAttribute("categories", se.GetAllEncadrant());
			  return "ajouterFilm";
		  }
			  
	  }

	
	
	
	@GetMapping("/modifierfilm/{idp}")
	public String modifierFilm(Model m,@PathVariable("idp") int id) {
		m.addAttribute("film",sf.getFilms(id));
		return "ajouterFilm";
		
	}
	@GetMapping("/allfilm")
	public String getAllFilms(Model m)
	{
		List<Film>liste=sf.getAllFilms();
		m.addAttribute("films",liste);
		return "listeFilms";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/supprimersalle/{id}")
	public String suprrimerProduit(@PathVariable int id ) {
		ss.supprimerSalle(id);
		return "redirect:/cinema/allsalle";
	}
	@GetMapping("/ajoutersalle")
	public String ajoutSalle(Model m) {
		m.addAttribute("cinemas",sc.getAllCinema());
		return "ajouterSalle";
	}
	@PostMapping("/savesalle")
	public String saveSalle (@ModelAttribute Salle s,Model m )throws IOException  {
		Integer id =s.getId();
		ss.saveSalle(s);
		if(id!=null) {
			return "redirect:/cinema/allsalle";
		}
		else
		{
			m.addAttribute("message","Ajout Avec succes");
			m.addAttribute("cinema",sc.getAllCinema());
			return "ajouterSalle";
		}
	
	}
	@GetMapping("/modifiersalle/{idp}")
	public String modifierProduit(Model m,@PathVariable("idp") int id) {
		m.addAttribute("cinema",sc.getAllCinema());
		m.addAttribute("salle",ss.getSalle(id));
		return "ajouterSalle";
		
	}
	
	
	
	@GetMapping("/allsalle")
	public String getAllSalle(Model m)
	{
		List<Salle>liste=ss.getAllSalles();
		m.addAttribute("salles",liste);
		m.addAttribute("cinema",sc.getAllCinema());
		return "listeSalle";
	}	
	
	@GetMapping("/affectuersallefilm")
	 public String ajouterSalleFilm(Model m)
	 {
	 List<Film>liste_f=sf.getAllFilms();
	 List<Salle>list_s=ss.getAllSalles();
	 m.addAttribute("films", liste_f);
	 m.addAttribute("salles", list_s);

	 
	 return "affecter";
	 }



	@PostMapping("/savesallefilm")
	 public String sauvgarderfilmSalles(@RequestParam  Film film ,  @RequestParam Salle salle ,Model m) throws IOException
	 {

	ss.filmsalle(salle,film);
	List<Film>liste_f=sf.getAllFilms();
	m.addAttribute("film",liste_f);
	List<Salle>liste_s=ss.getAllSalles();
	m.addAttribute("salles",liste_s);
	return "affecter";
/*
	 }
	@GetMapping("/filmmc")
	public String studentmc(@RequestParam String mc , Model m) {
		List<Film>liste=sf.getFilmsByMC(mc);
		m.addAttribute("films",liste);
		return "listeFilms";
	}

	*/
	
	
	
	 }
	
	@GetMapping("/allaffecter")
	public String listeAffecter(Model m)
	{
	List<Film>liste=sf.getAllFilms();
	m.addAttribute("films",liste);
	List<Salle>listesalle=ss.getAllSalles();
	m.addAttribute("salle",listesalle);
	return "listeAffecter";
	}
	@GetMapping("/filtresalle")
	public String affecterfilm(@RequestParam Salle salle , Model m) {
		List<Salle>listefilm=ss.getAllSalles();
		m.addAttribute("salle",listefilm);
		
		if(salle!=null) {
			List<Film>liste=sf.getBySalle(salle);
			Salle sallee=ss.getSalle(salle.getId());
			m.addAttribute("sallee",sallee);
			m.addAttribute("film",liste);
			return "listeAffecter";
			
		}
		else {
			
		return"redirect:/cinema/allaffecter";	
	}
		}
	
	@GetMapping("/desaffectersalle/{idp}/{idc}")
	public String desaffecterSalle(@PathVariable int idp,@PathVariable int idc ) throws IOException {
	ss.annuleSalleFilm(idp,idc);
		return "redirect:/cinema/allaffecter";
		
	}
	
}
