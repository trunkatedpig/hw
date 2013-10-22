import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String args[]) {
	Rational r1 = new Rational(1,2); 
	Rational r2 = new Rational(2,3);
	Rational r3 = new Rational(2,4);
	
	System.out.println(r1.equals(r2));
	System.out.println(r1.equals(r3));
	System.out.println(r1.mult(r2));
	System.out.println(r1.compareTo(r2));
	System.out.println(r2.compareTo(r1));
	System.out.println(r1.compareTo(r3));
    }
}
