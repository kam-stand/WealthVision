import { Component, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Stocks } from "../stocks/stocks";

interface company_object {
  symbol: string;
  name: string;
  description: string;
  marketCapitalization: string;
  eps: string;
  dilutedEPSTTM: string;
  peRatio: string;
  trailingPE: string;
  forwardPE: string;
  revenueTTM: string;
  profitMargin: string;
  operatingMarginTTM: string;
  dividendPerShare: string;
  dividendYield: string;
  quarterlyEarningsGrowthYOY: string;
  quarterlyRevenueGrowthYOY: string;
}

@Component({
  selector: 'app-company',
  standalone: true,
  imports: [Stocks],
  templateUrl: './company.html',
  styleUrls: ['./company.css']
})
export class Company {

  comp_object: company_object | null = null ;
  stock_option: string = '';

  constructor(private http: HttpClient) {}
  have_company_data:boolean = false;

  handleStock_Option(option: string): void {
    this.stock_option = option;
    console.log("The stock option for company frame is:", this.stock_option);

    this.http.get<company_object>(
      `${environment.API_SERVER_URL}api/v1/company/${this.stock_option}`,
      { withCredentials: true }
    ).subscribe({
      next: (data) => {
        console.log(data)
        this.comp_object = data;
        this.have_company_data = true;
      },
      error: (err) => {
        console.error('Error fetching company data:', err);
      }
    });
  }
}
