/*
 * This file tests a few variations on labelled break/continue statements.
 */

public class StmtLabels {
  public static void main(String[] args) {
    int count = 0;
    
    // test break label on compound statement
  lab1:
    {
      System.out.println("before lab1");
      if ( count == 0 ) 
	{ break lab1; }
      System.out.println("after lab1");
    }

    // test break label on an if statement
    System.out.println("before lab1a");
  lab1a:
    if ( count == 0 ) {
	break lab1a;
    } else {
	System.out.println("else clause; not break to lab1a");
    }
    System.out.println("after lab1a");

    // test continue label on compound statement
  lab2:
    {
      System.out.println("before lab2");
      //if ( count == 0 ) 
      //{ continue lab2; }  CAN NOT continue A COMPOUND STMT
      System.out.println("after lab2");
    }
  }
}
