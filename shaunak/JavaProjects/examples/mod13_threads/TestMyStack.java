public class TestMyStack {
   public static void main(String args[]) {
     MyStack stack = new MyStack();
     stack.push('H');
     stack.push('i');
     System.out.println("Stack is: " + String.copyValueOf(stack.data));

     stack.pop();
     stack.push('o');
     System.out.println("After one pop and another push, Stack is: " + 
	String.copyValueOf(stack.data));
   }
}
     
