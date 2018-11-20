import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AdminModule } from '../admin/admin.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EmployeeComponent } from './employee/employee.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { EmpPipe } from './pipe/emp.pipe';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmpdataService } from './services/empdata.service';
import { EmplistserviceComponent } from './emplistservice/emplistservice.component';
import { AdminRoutingModule } from 'src/admin/admin-routing.module';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmployeeComponent,
    ContactUsComponent,
    EmpPipe,
    EmployeeInfoComponent,
    PageNotFoundComponent,
    EmplistserviceComponent
  ],
  imports: [
    BrowserModule,
    AdminModule,
    AppRoutingModule
  ],
  providers: [EmpdataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
