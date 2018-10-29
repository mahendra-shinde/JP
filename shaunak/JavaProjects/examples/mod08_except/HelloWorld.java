public class HelloWorld {
  public static void main (String args[]) {
    int i = 0;

    String greetings [] = {
      "Hello world!",
      "No, I mean it!",
      "HELLO WORLD!!"
    };

    while (i < 4) {
      try {
        System.out.println (greetings[i]);
	i++;
      } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Re-setting Index Value");
        i = 0;
      } finally {
        System.out.println("This is always printed");
      }
    }
  }
}
