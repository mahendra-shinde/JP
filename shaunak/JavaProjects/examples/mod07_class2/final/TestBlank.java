public class TestBlank {
  private final int blankFinal;

  public TestBlank() { }

  public int getBlankFinal() { return blankFinal; }
  public void setBlankFinal(int x) { blankFinal = x; }

  public static void main(String[] args) {
    TestBlank t = new TestBlank();

    System.out.println("t.blankFinal = " + t.getBlankFinal());
    t.setBlankFinal(47);
    System.out.println("t.blankFinal = " + t.getBlankFinal());
    t.setBlankFinal(42);
    System.out.println("t.blankFinal = " + t.getBlankFinal());
  }
}
