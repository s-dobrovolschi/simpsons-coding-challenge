import { Component } from '@angular/core';
import { ConfigService } from './config/config.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(public configService: ConfigService) {
    this.configService.getAllCharacters()
    .subscribe((data) => {
        console.log(data.toString());
    });
  }
}
