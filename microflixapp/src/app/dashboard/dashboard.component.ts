import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { HeroService } from '../hero.service';
import { UserserviceService } from '../service/userservice.service';
import { MovieService } from '../service/movie.service';
import { User } from '../model/user';
import { Movie } from '../model/movie';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: [ './dashboard.component.css' ]
})
export class DashboardComponent implements OnInit {
  heroes: Hero[] = [];
  user: User;
  movies: Movie[] = [];

  constructor(private route: ActivatedRoute, private movieService: MovieService){}

  onKeyEnter(value: string){
    this.movieService
      .movieSearch(value)
      .subscribe(
        (data: Movie[]) => {this.movies=data},
        error => console.log(error)
      );
  }

  ngOnInit() {
      

      this.route.data
        .subscribe((data:{user:User}) => {
          this.user = data.user;
      });
  }
}