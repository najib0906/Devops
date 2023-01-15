import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListfilmComponent } from './listfilm/listfilm.component';
import { ListSalleComponent } from './list-salle/list-salle.component';
import { ListCinemaComponent } from './list-cinema/list-cinema.component';




@NgModule({
  declarations: [
    AppComponent,
    ListfilmComponent,
    ListSalleComponent,
    ListCinemaComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule ,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
