import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-news',
  imports: [],
  templateUrl: './news.html',
  styleUrl: './news.css'
})
export class News {

  @Input() title!: string;
  @Input() authors: string[] = [];
  @Input() url!: string;
  @Input() image!: string;
  @Input() source!: string;
  @Input() description!: string;

}
