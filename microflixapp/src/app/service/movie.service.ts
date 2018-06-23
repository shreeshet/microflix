import { Injectable } from '@angular/core';
import { Observable, of , Subject} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { Movie } from '../model/movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private movieSearchUrl= '/movieservice/movie/title';	

  constructor(private http: HttpClient) { }

  movieSearch(searchText: string) {
  	const url = `${this.movieSearchUrl}/${searchText}`;
    
    return this.http
  		.get(url)
  		.pipe(
  			tap(r => console.log(r))
  		);
  }
}
