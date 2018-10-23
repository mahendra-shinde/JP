public class TestThread {
  public static void main(String args[]) {
    Xyz r = new Xyz();
    Thread t = new Thread(r);
    t.start();
  }
}

class Xyz implements Runnable {
  int i;

  public void run() {
    i = 0;

    while (true) {
      System.out.println("Hello " + i++);
      if ( i == 50 ) {
	break;
      }
    }
  }
}
