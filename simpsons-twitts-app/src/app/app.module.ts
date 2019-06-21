import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { ConfigService } from './config/config.service';
import { TwittsService } from './service/twitts.service';
import { CharacterService } from './service/character.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    ConfigService,
    CharacterService,
    TwittsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
