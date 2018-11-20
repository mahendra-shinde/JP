import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { EmployeeComponent } from './employee/employee.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmplistserviceComponent } from './emplistservice/emplistservice.component';



const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'employeeslist', component: EmployeeInfoComponent },
  { path: 'employees', component: EmployeeComponent },
  { path: 'employeeservice', component: EmplistserviceComponent },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
