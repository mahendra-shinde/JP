import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderpipe'
})
export class EmpPipe implements PipeTransform {

  transform(value: string, gender: string): any {
    if (gender.toLowerCase() == "male") {
      return "Mr. " + value;
    } else {
      return "Mrs. " + value;
    }
  }
}