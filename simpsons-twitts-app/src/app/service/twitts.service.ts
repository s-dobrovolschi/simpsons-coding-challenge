import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { TwittModel } from "../model/twitt.model";
import { Observable } from "rxjs";

@Injectable()
export class TwittsService {

    constructor(private http: HttpClient) { }

    allTwittsUrl = '/api/twitts';

    getAllTwitts() {
        return this.http.get<TwittModel[]>(this.allTwittsUrl);
    }
}