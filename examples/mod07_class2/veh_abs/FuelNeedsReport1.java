public class FuelNeedsReport1 {
  public void generateText(PrintStream output) {
    Company c = Company.getCompany();
    Vehicle1 v;
    double fuel;
    double total_fuel = 0.0;

    for ( int i = 0; i < c.getFleetSize(); i++ ) {
      v = c.getVehicle1(i);

      // Calculate the fuel needed for this trip
      fuel = v.calcTripDistance() / v.calcFuelEfficency();

      output.println("Vehicle " + v.getName() + " needs "
                     + fuel + " liters of fuel.");
      total_fuel += fuel;
    }
    output.println("Total fuel needs is " + total_fuel + " liters.");
  }
}
