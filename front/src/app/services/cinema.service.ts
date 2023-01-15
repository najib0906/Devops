import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cinema } from '../models/cinema';

@Injectable({
  providedIn: 'root'
})
export class CinemaService {

  host= "Http://localhost:8080/restapicinema"

  constructor(private client :HttpClient) { }                                //injection  dependency
    public getAllcinema():Observable<Cinema[]>           // to93od aal ecoute d'un flux generique , changement de données fe table

  {
    return this.client.get<Cinema[]>(this.host+"/all")
  }
}
