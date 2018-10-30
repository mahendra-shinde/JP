import java.io.*;

public class TestMultiB1 extends TestMultiA {
  public void methodA()
       throws FileNotFoundException, UTFDataFormatException,
	      ArithmeticException {
    // do some IO, number crunching
    // FileNotFoundException and UTFDataFormatException are subclasses
    // of IOException, so this is valid
  }
}
