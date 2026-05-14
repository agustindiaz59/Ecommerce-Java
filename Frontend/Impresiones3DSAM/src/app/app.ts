import { Component, OnInit, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from './components/navbar/navbar';
import { Carousel } from "./components/carousel/carousel";
import { initFlowbite } from 'flowbite';

@Component({
  selector: 'app-root',
  imports: [Navbar, Carousel],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit{
  protected readonly title = signal('Impresiones3DSAM');


  ngOnInit(): void {
    initFlowbite();
  }
}
