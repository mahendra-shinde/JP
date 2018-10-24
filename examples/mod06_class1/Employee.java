public class Employee {

  private String name;
  private MyDate birthDate;
  private float  salary;

  // Constructor
  public Employee(String name, MyDate DoB, float salary) {
    this.name = name;
    this.birthDate = DoB;
    this.salary = salary;
  }

  public String getDetails() {
    return "Name: " + name + "\nSalary: " + salary
           + "\nBirth Date: " + birthDate;
  }
}
