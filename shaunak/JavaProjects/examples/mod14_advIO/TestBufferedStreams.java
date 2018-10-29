import java.io.*;

public class TestBufferedStreams {
  public static void main(String[] args) {
    try {
      FileReader     input     = new FileReader(args[0]);
      BufferedReader bufInput  = new BufferedReader(input);
      FileWriter     output    = new FileWriter(args[1]);
      BufferedWriter bufOutput = new BufferedWriter(output);
      String line;

      // read the first line
      line = bufInput.readLine();

      while ( line != null ) {
	// write the line out to the output file
	bufOutput.write(line, 0, line.length());
	bufOutput.newLine();

	// read the next line
	line = bufInput.readLine();
      }

      bufInput.close();
      bufOutput.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
