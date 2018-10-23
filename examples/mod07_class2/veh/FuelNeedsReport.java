package shipping.reports;

import shipping.domain.*;
import java.io.*;

public class FuelNeedsReport {
  public void generateText(PrintStream output) {
    Company c = Company.getCompany();
    Vehicle [] fleet = c.getFleet();
    for (int i = 0; i < fleet.length; i++) {
      output.println("Mileage is " + (fleet[i].getMileage()));
    }
  }

  public static void main(String [] args) {
    new FuelNeedsReport().generateText(System.out);
  }
}
