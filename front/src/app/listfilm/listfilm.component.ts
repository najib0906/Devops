import { Film } from './../models/film';
import { FilmService } from './../services/film.service';
import { Component , OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listfilm',
  templateUrl: './listfilm.component.html',
  styleUrls: ['./listfilm.component.css']
})
export class ListfilmComponent implements OnInit{



  constructor( private service:FilmService , private router : Router){}
  Film!:Film[];
  ngOnInit(): void {                                   // executer les instruction ly f westha

this.service.getAllfilm().subscribe(data=>this.Film=data)

}
checksalle() {
  this.router.navigate(["/salle"])
}

}
