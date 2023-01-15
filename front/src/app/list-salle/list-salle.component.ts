import { Film } from './../models/film';
import { Salle } from './../models/salle';
import { Component, OnInit } from '@angular/core';
import { SalleService } from './../services/salle.service';
import {Router} from "@angular/router"

@Component({
  selector: 'app-list-salle',
  templateUrl: './list-salle.component.html',
  styleUrls: ['./list-salle.component.css']
})
export class ListSalleComponent implements OnInit{

  constructor( private service:SalleService , private router : Router){}
  Salle!:Salle[];
  ngOnInit(): void {

    this.service.getAllsalle().subscribe(data=>this.Salle=data)


}
checkfilms(){
  this.router.navigate(["/film"])

}
}
