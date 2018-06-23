import { Injectable } from '@angular/core';
import { Observable, of , Subject} from 'rxjs';
import { User } from '../model/user';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { Router, Resolve, RouterStateSnapshot,Route, CanActivate, 
         ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService implements Resolve<User>,CanActivate{
	
  private userLoginUrl= '/userservice/first_name/';	
  private user:User;

  constructor(private http: HttpClient,private router: Router) { }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot):   Observable<User>{
    return of(this.user);
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    let url: string = state.url;
    
    if(this.user) return true;

    this.router.navigate(['/']);
    return false;
  }

  login(username:string,password:string): Observable<User> {
  	const url = `${this.userLoginUrl}/${username}`;
  	return this.http.get(url)
      .pipe(
        map(res => Object.assign(new User(),res)),
        tap(u => {this.user=u;})
      );
  }
}
