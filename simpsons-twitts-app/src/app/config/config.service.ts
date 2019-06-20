import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ConfigService {

    constructor(private http: HttpClient) { }

    allCharactersUrl = '/api/characters';

    getAllCharacters() {
        return this.http.get(this.allCharactersUrl);
    }
}