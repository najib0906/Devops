import { Cinema } from "./cinema";



export interface Salle {
  id:number;
  nom:string;
  nb_place:number;
  cinema: Cinema;

}
