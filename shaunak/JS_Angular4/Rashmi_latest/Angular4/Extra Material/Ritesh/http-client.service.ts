import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Posts } from '../model/posts';


@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private http: HttpClient) {

  }

  getItems() {
    return this.http.get('http://localhost:3000/posts');
  }

  setItem(post: Posts) {
    return this.http.post("http://localhost:3000/posts", post);

  }

  updateshoppingitem(post: Posts) {
    return this.http.put('http://localhost:3000/posts/' + post.id, post);

  }

  deletePostItem(id) {
    return this.http.delete('http://localhost:3000/posts/' + id)

  }


}
