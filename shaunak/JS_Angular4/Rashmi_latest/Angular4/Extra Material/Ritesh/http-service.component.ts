import { Component, OnInit } from '@angular/core';
import { HttpClientService } from '../services/http-client.service';
import { Posts } from '../model/posts';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-http-service',
  templateUrl: './http-service.component.html',
  styleUrls: ['./http-service.component.css']
})
export class HttpServiceComponent implements OnInit {
  posts: Posts[];
  toggleForm: Boolean = false;
  selectedPost: Posts;


  constructor(private httpclientservice: HttpClientService) { }

  ngOnInit() {
    this.getItems()

  }

  getItems() {
    return this.httpclientservice.getItems().subscribe(posts => { this.posts = <Posts[]>posts; });
  }

  setItems(post: Posts) {
    //this.httpclientservice.setItem(post).subscribe(post=>{console.log(post);this.getitems();});
  }

  SavePosts(frm: NgForm): void {

    let post: Posts = {
      id: Number(frm.value.id),
      title: frm.value.title,
      author: frm.value.author
    }

    this.httpclientservice.setItem(post).subscribe(post => { this.getItems(); })
    
  }


  EditPost(editfrm: NgForm) {
    let newpost: Posts = {
      id: Number(this.selectedPost.id),
      title: editfrm.value.title,
      author: editfrm.value.author,

    }
    this.httpclientservice.updateshoppingitem(newpost)

      .subscribe(result => {
        console.log('original item to be updated with old values' + result);
        this.getItems();
        this.toggleForm = !this.toggleForm;
      })

  }


  showEditform(post) {
    this.selectedPost = post;
    this.toggleForm = true;
  }

  showAddForm(){
    this.toggleForm = false;
  }

  deleteItem(id) {
    this.httpclientservice.deletePostItem(id)
      .subscribe(result => {
        console.log(result);

        for (var i = 0; i < this.posts.length; i++) {
          if (id == this.posts[i].id) {
            this.posts.splice(i, 1);



          }

        }
      })
  }


}
