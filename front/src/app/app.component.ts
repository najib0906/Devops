import { ListfilmComponent } from './listfilm/listfilm.component';
import { Routes } from '@angular/router';
import { Component } from '@angular/core';
import { ListSalleComponent } from './list-salle/list-salle.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'GestionCinema';
}
