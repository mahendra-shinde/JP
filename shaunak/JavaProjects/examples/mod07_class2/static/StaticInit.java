public class StaticInit {
  public static int count = 1;
  static {
    count = Integer.getInteger("myApplication.counter").intValue();
  }
}
