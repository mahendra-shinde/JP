import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpDataService {

  constructor(private http:HttpClient) {  }
  
 getshoppingitems() 
  {
    return this.http.get('http://localhost:3000/posts');
  }
}
