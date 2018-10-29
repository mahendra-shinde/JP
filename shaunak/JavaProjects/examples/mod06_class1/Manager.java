public class Manager extends Employee {
  private String department;

  public Manager(String name, MyDate DoB,
		 float salary, String dept) {
    super(name, DoB, salary);
    this.department = dept;
  }

  public String getDetail() {
    return super.getDetails() + "\nDepartment: " + department;
  }
}
