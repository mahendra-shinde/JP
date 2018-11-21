import { Component, OnInit } from '@angular/core';
import { HttpDataService } from '../services/http-data.service';
import { Item } from '../model/Item';

@Component({
  selector: 'app-http-service-call',
  templateUrl: './http-service-call.component.html',
  styleUrls: ['./http-service-call.component.css']
})
export class HttpServiceCallComponent implements OnInit {
  private _httpService;
  items:Item[];
  
  constructor(private HttpDataService:HttpDataService) {

   }

  ngOnInit() {
    this.getItems();
  }

  getItems() {
    this.HttpDataService.getshoppingitems().subscribe(items=>this.items=<Item[]>items);
  }

}
