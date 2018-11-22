import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Item } from '../model/item';

@Injectable({
  providedIn: 'root'
})
export class JsondataService {

  constructor(private http:HttpClient) { }

  getshoppingitems(){
    return this.http.get('http://localhost:3000/items');
  }

  postshoppingitems(item:Item){
    return this.http.post('http://localhost:3000/items',item);
  }

  putshoppingitems(item:Item){
    return this.http.put('http://localhost:3000/items/'+item.id,item);
  }

  deleteshoppingitem(itemid:Number){
    return this.http.delete('http://localhost:3000/items/'+itemid);
  }
}
