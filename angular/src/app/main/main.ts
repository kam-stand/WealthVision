import { Component } from '@angular/core';
import { Navbar } from "../navbar/navbar";
import { Home } from '../home/home';
import { News } from "../news/news";
import { Stocks } from '../stocks/stocks';
import { Company } from "../company/company";

@Component({
  selector: 'app-main',
  imports: [Navbar, Home, Company],
  templateUrl: './main.html',
  styleUrl: './main.css'
})
export class Main {

  view: string = "home";

  HandleNav(option: string){
    console.log("Navigation is " + option);
    switch (option.toLowerCase()){
      case "home":
        this.view = "home"
        break
      case "stocks":
        this.view = "stocks"
        break
      case "etf":
        this.view = "etf"
        break
      case "crypto":
        this.view = "crypto"
        break
      case "forex":
        this.view = "forex"
        break
      case "commodities":
        this.view = "commodities"
        break
      case "profile":
        this.view = "profile"
        break
      
      default:
        this.view = "home"
    }
  }
  
}
