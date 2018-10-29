public class Count2 {
  private int serialNumber;
  private static int counter = 0;

  public static int getTotalCount() {
    return counter;
  }

  public Count2() {
    counter++;
    serialNumber = counter;
  }

  public String toString() {
    return "Count2 object: serial number is " + serialNumber +
      " counter is " + getTotalCount();
  }

  public static void main(String [] args) {
    Count2 [] c = new Count2[10];

    for (int i = 0; i < 10; i++) {
      c[i] = new Count2();
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(c[i]);
    }
  }
}
