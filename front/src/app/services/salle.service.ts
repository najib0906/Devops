import { Salle } from './../models/salle';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SalleService {
  host= "Http://localhost:8080/restapiSalle"

  constructor(private client :HttpClient) { }                                //injection  dependency
    public getAllsalle():Observable<Salle[]>           // to93od aal ecoute d'un flux generique , changement de données fe table

  {
    return this.client.get<Salle[]>(this.host+"/all")
  }
}
