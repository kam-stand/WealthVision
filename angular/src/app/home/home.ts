import { Component } from '@angular/core';
import { News } from "../news/news";
import { HttpClient } from '@angular/common/http';

interface NewsItem {
  title: string;
  url: string;
  authors: string[];
  description: string;
  banner_image: string;
  source: string;
}

@Component({
  selector: 'app-home',
  imports: [News],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
newsList: NewsItem[] = [];

  constructor(private http: HttpClient) {}
ngOnInit(): void {
  this.http.get<NewsItem[]>('http://localhost:8080/api/v1/home', {withCredentials:true}).subscribe({
    next: (data) => {
      this.newsList = data;
    },
    error: (err) => {
      console.error('Error fetching news:', err);
    }
  });
}

}
