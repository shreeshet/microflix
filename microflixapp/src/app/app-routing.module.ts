import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HeroesComponent }      from './heroes/heroes.component';
import { DashboardComponent }   from './dashboard/dashboard.component';
import { HeroDetailComponent }  from './hero-detail/hero-detail.component';
import { LoginComponent } from './login/login.component';
import { UserserviceService } from './service/userservice.service';

const routes: Routes = [
  { path: '',  component: LoginComponent},
  { path: 'dashboard',  
  		component: DashboardComponent,
	  	resolve:{
	  		user: UserserviceService
	  	},
      canActivate: [UserserviceService]
  	}  
];


@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [ RouterModule ],
  providers: [
  	UserserviceService
  ]
})
export class AppRoutingModule { }
