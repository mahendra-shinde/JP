import java.io.*;
import java.sql.*;

public class TestMultiB2 extends TestMultiA {
  public void methodA()
       throws FileNotFoundException, UTFDataFormatException,
	      ArithmeticException, SQLException {
    // do some IO, number crunching, and SQL stuff
    // This should fail because we have added a new exception.
  }
}
