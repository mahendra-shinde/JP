public class TestWhileLoops {

  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
  }

  private static void test1() {
    System.out.println("Test #1 - while loop with block");
    int i = 0;
    while ( i < 10 ) {
      System.out.println(i + " squared is " + (i*i));
      i++;
    }
  }

  private static void test2() {
    System.out.println("Test #2 - while loop with single statement");
    int i = 0;
    while ( i < 10 )
      System.out.println(++i + " squared is " + (i*i));
  }

  private static void test3() {
    System.out.println("Test #3 - do-while loop with block");
    int i = 0;
    do {
      System.out.println(i + " squared is " + (i*i));
      i++;
    } while ( i < 10 );
  }

  private static void test4() {
    System.out.println("Test #4 - do-while loop with single statement");
    int i = 0;
    do
      System.out.println(++i + " squared is " + (i*i));
    while ( i < 10 );
  }
}
