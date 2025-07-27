import { Component } from '@angular/core';
import { Navbar } from '../navbar/navbar';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Component({
  selector: 'app-profile',
  standalone: true,
  imports: [Navbar],
  templateUrl: './profile.html',
  styleUrls: ['./profile.css']
})
export class Profile {
  currentView = 'data'; // ✅ parent owns the state
  constructor (private http: HttpClient) {};
  onViewChange(newView: string) {
    this.currentView = newView; // ✅ update parent state
    console.log('Profile received view:', this.currentView);
    this.http.get(environment.API_SERVER_URL + "api/v1/user", {withCredentials:true}).subscribe(
      data => {
        console.log(data);
      }
    )
  }
}
