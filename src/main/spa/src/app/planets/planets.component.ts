import { Component, OnInit } from '@angular/core';
import { Client, Planet, Moon } from '../universe-web-api-client';

@Component({
  selector: 'app-planets',
  templateUrl: './planets.component.html',
  styleUrls: ['./planets.component.scss']
})
export class PlanetsComponent implements OnInit {

  public planets: Planet[] = [];

  constructor(private universeClient: Client) { }

  ngOnInit() {
    this.universeClient.listPlanets(10, 0, '{}')
      .subscribe(planets => {
        this.planets = planets;
      });
  }
}
