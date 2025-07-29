import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-company',
  imports: [],
  templateUrl: './company.html',
  styleUrl: './company.css'
})
export class Company {

  @Input()  Symbol!: string;
  @Input()  Name!: string;
  @Input()  Description!: string;
  @Input()  MarketCapitalization!: string;
  @Input()  EPS!: string;
  @Input()  DilutedEPSTTM!: string;
  @Input()  PERatio!: string;
  @Input()  TrailingPE!: string;
  @Input()  ForwardPE!: string;
  @Input()  RevenueTTM!: string;
  @Input()  ProfitMargin!: string;
  @Input()  OperatingMarginTTM!: string;
  @Input()  DividendPerShare!: string;
  @Input()  DividendYield!: string;
  @Input()  QuarterlyEarningsGrowthYOY!: string;
  @Input()  QuarterlyRevenueGrowthYOY!: string;

}
