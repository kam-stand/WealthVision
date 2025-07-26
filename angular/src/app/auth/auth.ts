import { Component } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-auth',
  imports: [],
  templateUrl: './auth.html',
  styleUrl: './auth.css'
})
export class Auth {
  login = false;

  constructor(private http: HttpClient) {
    this.http = http
   }
  handleLogin(){
    this.login = true;
      window.location.href = `${environment.API_SERVER_URL}/oauth2/authorization/google`;
  }
  
}
