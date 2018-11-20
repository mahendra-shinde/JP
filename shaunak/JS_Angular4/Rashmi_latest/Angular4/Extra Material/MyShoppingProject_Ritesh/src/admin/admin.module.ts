import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { AdminRoutingModule } from './admin-routing.module';



@NgModule({
  declarations: [
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AdminRoutingModule
  ],
  providers: [],
  bootstrap: [LoginComponent]
})
export class AdminModule { }
