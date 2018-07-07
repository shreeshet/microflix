import { Injectable } from '@angular/core';
import { Observable, of , Subject} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { Movie } from '../model/movie';
import { UserserviceService } from './userservice.service';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private movieSearchUrl= '/movieservice/movie/title';	

  constructor(private http: HttpClient,private userService:UserserviceService) { }

  movieSearch(searchText: string) {
  	const url = `${this.movieSearchUrl}/${searchText}`;
    
    return this.http
  		.get(url,{
        headers:{
          'X-Auth-Token':this.userService.authToken
        }
      })
  		.pipe(
  			tap(r => console.log(r))
  		);
  }
}
