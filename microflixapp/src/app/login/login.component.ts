import { Component, OnInit , EventEmitter, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { User } from '../model/user';
import { UserserviceService } from '../service/userservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  @Output() loginsuccess = new EventEmitter<User>();

  username: string;
  password: string;

  constructor(private router : Router,private userService : UserserviceService) { }

  ngOnInit() {
  }

  login() {
     this.userService.login(this.username,this.password)
        .subscribe((user: User)=> {
          this.router.navigate(["dashboard"]);
          this.loginsuccess.emit(user);          
        });  
  }

}
