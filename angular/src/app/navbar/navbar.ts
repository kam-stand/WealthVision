import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [],
  templateUrl: './navbar.html',
  styleUrls: ['./navbar.css']
})
export class Navbar {
  @Input() view = 'data'; // ✅ receives state from parent
  @Output() viewChange = new EventEmitter<string>(); // ✅ emits changes to parent

  handleNav(view: string) {
    this.viewChange.emit(view); // ✅ tell parent which view was clicked
  }
}
