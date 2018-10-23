public class TestShift {

  public static String bitPattern(int value) {
    int BIT1_MASK = 1;
    final char[] bits = new char[32];

    for ( int i = 31; i >= 0; i-- ) {
      if ( (value & BIT1_MASK) == 1 ) {
	bits[i] = '1';
      } else {
	bits[i] = '0';
      }
      value >>>= 1;
    }

    return new String(bits);
  }

  public static void main(String[] args) {
    int num1 = 1357;
    int num2 = -1357;

    System.out.println("num1 (" + num1 + ") as a bit pattern: " + bitPattern(num1));
    System.out.println("num2 (" + num2 + ") as a bit pattern: " + bitPattern(num2));
    System.out.println("" + num1 + " >> 5 = (" + (num1 >> 5) + ") " + bitPattern(num1 >> 5));
    System.out.println("" + num2 + " >> 5 = (" + (num2 >> 5) + ") " + bitPattern(num2 >> 5));
    System.out.println("" + num1 + " >>> 5 = (" + (num1 >>> 5) + ") " + bitPattern(num1 >>> 5));
    System.out.println("" + num2 + " >>> 5 = (" + (num2 >>> 5) + ") " + bitPattern(num2 >>> 5));
    System.out.println("" + num1 + " << 5 = (" + (num1 << 5) + ") " + bitPattern(num1 << 5));
    System.out.println("" + num2 + " << 5 = (" + (num2 << 5) + ") " + bitPattern(num2 << 5));
  }
}

/*
num1 (1357) as a bit pattern:  00000000000000000000010101001101
num2 (-1357) as a bit pattern: 11111111111111111111101010110011
1357   >> 1 = 00000000000000000000001010100110
-1357  >> 1 = 11111111111111111111110101011001
1357   >> 5 = 00000000000000000000000000101010
-1357  >> 5 = 11111111111111111111111111010101
1357  >>> 5 = 00000000000000000000000000101010
-1357 >>> 5 = 00000111111111111111111111010101
1357   << 1 = 00000000000000000000101010011010
-1357  << 1 = 11111111111111111111010101100110
1357   << 5 = 00000000000000001010100110100000
-1357  << 5 = 11111111111111110101011001100000
*/
