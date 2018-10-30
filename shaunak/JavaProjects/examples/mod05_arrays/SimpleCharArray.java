public class SimpleCharArray {
    public static void main(String[] args) {
        char[] characters = createArray();
        
        printArray(characters);
        System.out.println();
    }
    
    public static char[] createArray() {
        char[] s;
        
        s = new char[26];
        for ( int i=0; i<26; i++ ) {
            s[i] = (char) ('A' + i);
        }
        
        return s;
    }
    
    public static void printArray(char[] array) {
        System.out.print('<');
        for ( int i = 0; i < array.length; i++ ) {
            // print an element
            System.out.print(array[i]);
            // print a comma delimiter if not the last element
            if ( (i + 1) < array.length ) {
                System.out.print(", ");
            }
        }
        System.out.print('>');
    }
}
