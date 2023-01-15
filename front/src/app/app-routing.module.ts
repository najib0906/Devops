import { ListCinemaComponent } from './list-cinema/list-cinema.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListSalleComponent } from './list-salle/list-salle.component';
import { ListfilmComponent } from './listfilm/listfilm.component';

const routes:Routes =[

  {path:"film" , component: ListfilmComponent},
  {path:"salle" , component: ListSalleComponent},
  {path:"cinema" , component:ListCinemaComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
