public class OtherClass {
  public void incrementNumber() {
    Count1.counter++;
  }

  public static void main(String [] args) {
    System.out.println("Count1.counter = " + Count1.counter);
    new OtherClass().incrementNumber();
    System.out.println("Count1.counter = " + Count1.counter);
  }
}

