public class Count1 {
  private int serialNumber;
  // grant access to counter from outside this class
  public static int counter = 0;

  public Count1() {
    counter++;
    serialNumber = counter;
  }
}
