import { Component } from '@angular/core';
import { Navbar } from '../navbar/navbar';

@Component({
  selector: 'app-profile',
  standalone: true,
  imports: [Navbar],
  templateUrl: './profile.html',
  styleUrls: ['./profile.css']
})
export class Profile {
  currentView = 'data'; // ✅ parent owns the state

  onViewChange(newView: string) {
    this.currentView = newView; // ✅ update parent state
    console.log('Profile received view:', this.currentView);
  }
}
