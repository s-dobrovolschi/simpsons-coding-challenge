import { Component } from '@angular/core';
import { CharacterService } from './service/character.service';
import { CharacterModel } from './model/character.model';
import { TwittModel } from './model/twitt.model';
import { TwittsService } from './service/twitts.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  twitts: Array<TwittModel> = new Array();
  constructor(
    public characterService: CharacterService,
    public twittsService: TwittsService) {
    this.findAllTwitts();
  }

  private findAllCharacters(){
    this.characterService.getAllCharacters().subscribe(
      (data) => {
        console.log(data.toString());
      }
    );
  }

  private findAllTwitts(){
    this.twittsService.getAllTwitts().subscribe(
      (data) => {
        this.twitts = data as TwittModel[];
      }
    );
  }
}
