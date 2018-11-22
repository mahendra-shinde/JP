import { Component, OnInit } from '@angular/core';
import { Item } from '../model/item';
import { JsondataService } from '../services/jsondata.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-http-service-call',
  templateUrl: './http-service-call.component.html',
  styleUrls: ['./http-service-call.component.css']
})
export class HttpServiceCallComponent implements OnInit {

  itemlist: Item[];
  toggleForm: boolean=false;
  edit_Item:Item;
  //edit_itemid: number;
  //edit_itemname: string
  //edit_itemqty: number
  
  constructor(private _jsondataservice:JsondataService) { }

  ngOnInit() {
    this.getItems();
  }

  showEditForm(i){
    this.edit_Item = i;
    //this.edit_itemid = i.id;
    //this.edit_itemname = i.name;
    //this.edit_itemqty = i.quantity;
    this.toggleForm=true;
  }

  hideEditForm(){
    this.toggleForm=false;
  }

  getItems(){
    this._jsondataservice.getshoppingitems().subscribe( items => {this.itemlist = <Item[]>items;})
  }

  putItems(frm:NgForm){
    let item:Item = {id:Number(frm.value.itemid),
                  name:frm.value.itemname,
                  quantity:Number(frm.value.itemqty)};

    console.log(item);
    this._jsondataservice.postshoppingitems(item).subscribe(item => {this.getItems()});
  } 
   
  editItem(editform:NgForm){
    let item:Item = {id:this.edit_Item.id,
                      name:editform.value.itemname,
                      quantity:Number(editform.value.itemqty)};
    
    console.log(item);
    this._jsondataservice.putshoppingitems(item).subscribe(item => {this.getItems()});
    this.hideEditForm();
  }

  deleteItem(id){
    this._jsondataservice.deleteshoppingitem(id).subscribe(item => {this.getItems()});
  }
}
