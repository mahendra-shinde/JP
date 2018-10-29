import java.io.*;

public class TestNodeStreams {
  public static void main(String[] args) {
    try {
      FileReader input = new FileReader(args[0]);
      FileWriter output = new FileWriter(args[1]);
      char[]     buffer = new char[128];
      int        charsRead;

      // read the first buffer
      charsRead = input.read(buffer);

      while ( charsRead != -1 ) {
	// write the buffer out to the output file
	output.write(buffer, 0, charsRead);

	// read the next buffer
	charsRead = input.read(buffer);
      }

      input.close();
      output.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
