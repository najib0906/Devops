import { Film } from './../models/film';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilmService {
  host= "Http://localhost:8080/restapifilm"

  constructor(private client :HttpClient) { }                                //injection  dependency
    public getAllfilm():Observable<Film[]>           // to93od aal ecoute d'un flux generique , changement de données fe table

  {
    return this.client.get<Film[]>(this.host+"/all")
  }
}
