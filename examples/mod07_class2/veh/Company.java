package shipping.domain;

public class Company {
  private static Company instance = new Company();
  private String name;
  private Vehicle[] fleet;

  public static Company getCompany() {
    return instance;
  }

  private Company() {
    fleet = new Vehicle[4];
    fleet[0] = new Vehicle(8);
    fleet[1] = new Vehicle(9);
    fleet[2] = new Vehicle(4);
    fleet[3] = new Vehicle(3);
  }

  public Vehicle[] getFleet() {
    return fleet;
  }
}

