public class TestCounter {
  public static void main(String[] args) {
    System.out.println("Number of counter is "
                       + Count2.getTotalCount());
    Count2 count1 = new Count2();
    System.out.println("Number of counter is "
                       + Count2.getTotalCount());
  }
}
