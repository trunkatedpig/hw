import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
    	Loops l; 
    	l = new Loops();

    	System.out.println("-- Tests for Recursive Factorial --");

       	System.out.println(l.fact(-1) + " is -1"); // -1 is defined as output for domain failure
    	System.out.println(l.fact(0) + " is 1");
       	System.out.println(l.fact(1) + " is 1");
       	System.out.println(l.fact(2) + " is 2");
       	System.out.println(l.fact(3) + " is 6");
       	System.out.println(l.fact(4) + " is 24");
       	System.out.println(l.fact(5) + " is 120");

    	System.out.println("-- Tests for While Loop Factorial --");

       	System.out.println(l.fact2(-1) + " is -1"); // -1 is defined as output for domain failure
    	System.out.println(l.fact2(0) + " is 1");
       	System.out.println(l.fact2(1) + " is 1");
       	System.out.println(l.fact2(2) + " is 2");
       	System.out.println(l.fact2(3) + " is 6");
       	System.out.println(l.fact2(4) + " is 24");
       	System.out.println(l.fact2(5) + " is 120");
    }
}