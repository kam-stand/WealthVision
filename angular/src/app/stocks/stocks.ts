import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

interface stockList {
  symbol: string;
  name: string;
}

@Component({
  selector: 'app-stocks',
  standalone: true,
  imports:[FormsModule],
  templateUrl: './stocks.html',
  styleUrls: ['./stocks.css']
})
export class Stocks implements OnInit {

  stock_list: stockList[] = [];
  searchTerm: string = '';
  @Output() stockChosen = new EventEmitter<string>();

  onSelectStock(stock:string){
    this.stockChosen.emit(stock);
    console.log("the stock ticker is: ", stock);
  }

  ngOnInit(): void {
    fetch('/nyse_full_tickers.json')
      .then(res => res.json())
      .then((data: any[]) => {
        this.stock_list = data.map(stock => ({
          symbol: stock.symbol,
          name: stock.name
        }));
      })
      .catch(err => console.error('Error loading stock data:', err));
  }

  get filteredStocks(): stockList[] {
    const term = this.searchTerm.toLowerCase();
    return this.stock_list.filter(stock =>
      stock.name.toLowerCase().includes(term) ||
      stock.symbol.toLowerCase().includes(term)
    );
  }
}
