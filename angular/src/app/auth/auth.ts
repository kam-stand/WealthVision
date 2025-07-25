import { NgIf } from '@angular/common';
import { Component } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http'; // ✅ Import HttpClient
import { environment } from '../../environments/environment.development';

@Component({
  selector: 'app-auth',
  standalone: true,
  imports: [NgIf, HttpClientModule],
  templateUrl: './auth.html',
  styleUrls: ['./auth.css']
})
export class Auth {
  loading = false;

  constructor(private http: HttpClient) {}

  handleLogin() {
    this.loading = true;
    this.http.get(environment.API_SERVER_URL).subscribe({
      next: response => {
        console.log('Response:', response);
        this.loading = false;
      },
      error: error => {
        console.error('Error:', error);
        this.loading = false;
      }
    });
  }
}
