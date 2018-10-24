public class ControlledThread extends Thread {
  static final int SUSP = 1;
  static final int STOP = 2;
  static final int RUN = 0;
  private int state = RUN;

  public synchronized void setState(int s) {
    state = s;
    if ( s == RUN ) {
      notify();
    }
  }

  public synchronized boolean checkState() {
    while ( state == SUSP ) {
      try {
        wait();
      } catch (InterruptedException e) {
        // ignore
      }
    }
    if ( state == STOP ) {
      return false;
    }
    return true;
  }

  public void run() {
    while ( true ) {
      //doSomething();

      // Be sure shared data is in consistent state in
      // case the thread is waited or marked for exiting
      // from run()
      if ( !checkState() ) {
        break;
      }
    }
  }
}
