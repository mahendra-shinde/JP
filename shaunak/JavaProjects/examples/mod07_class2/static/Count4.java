public class Count4 {
  public static int counter;
  static {
    counter = Integer.getInteger("myApp.Count4.counter").intValue();
  }
}
