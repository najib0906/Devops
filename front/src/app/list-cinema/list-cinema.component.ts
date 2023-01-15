import { Cinema } from './../models/cinema';
import { CinemaService } from './../services/cinema.service';
import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router"

@Component({
  selector: 'app-list-cinema',
  templateUrl: './list-cinema.component.html',
  styleUrls: ['./list-cinema.component.css']
})
export class ListCinemaComponent implements OnInit{

constructor( private service:CinemaService , private router : Router){}
Cinema!:Cinema[];
  ngOnInit(): void {

    this.service.getAllcinema().subscribe(data=>this.Cinema=data)


}
checkfilms(){
  this.router.navigate(["/cinema"])

}
}
