import java.util.*;
import java.io.*;

public class Driver {
    
    public static void main (String args[]) {
	Rational r1,r2,r3;
	r1 = new Rational(2,3);
	r2 = new Rational(4,6);
	r3 = new Rational(4,5);


	System.out.println(r1.equals(r2));
	System.out.println(r1.equals(r3));
	System.out.println(r1.mult(r3));
	System.out.println(r1.compareTo(r2));
	System.out.println(r1.compareTo(r3));
	System.out.println(r3.compareTo(r2));
    }
}