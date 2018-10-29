public class Loops {
  public static void main(String [] args) throws Throwable {

loop:
    while (true) {
      for (int i = 0; i < 100; i++) {
        int c = System.in.read();
        if (c == 'x') {
          continue loop;
        } else if (c == 'y') {
          break loop;
        } else {
          System.out.print((char)c);
          //System.out.flush();
        }
      }
      System.out.println(">");
    }
    System.out.println();
  }
}
