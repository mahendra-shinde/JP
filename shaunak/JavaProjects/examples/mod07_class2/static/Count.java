public class Count {
  private int serialNumber;
  private static int counter = 0;

  public Count() {
    counter++;
    serialNumber = counter;
  }

  public String toString() {
    return "Count object: serial number is " + serialNumber +
      " counter is " + counter;
  }

  public static void main(String [] args) {
    Count [] c = new Count[10];

    for (int i = 0; i < 10; i++) {
      c[i] = new Count();
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(c[i]);
    }
  }
}
