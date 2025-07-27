import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-navbar',
  imports: [],
  templateUrl: './navbar.html',
  styleUrl: './navbar.css'
})
export class Navbar {

  @Output() navSelected = new EventEmitter<string>();
  onNavClick(option:string){
    this.navSelected.emit(option);
    console.log("The nav bar option: " + this.navSelected);
  }

}
