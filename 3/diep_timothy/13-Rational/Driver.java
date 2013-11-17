import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Rational r1,r2,r3;
	r1 = new Rational(14,3);
	r2 = new Rational(6,7);
	
	System.out.println("The value of " + r1.getA() + "/" + r1.getB() + " is: " + r1.getValue());
	System.out.println();
	System.out.println("Is " + r1.getA() + "/" + r1.getB() + " equal to " + r2.getA() + "/" + r2.getB() + "? " + r1.equals(r2));
	System.out.println();
	System.out.println("The value of " + r1.getA() + "/" + r1.getB() + " multiplied by " + r2.getA() + "/" + r2.getB() + " is: " + r1.mult(r2).getValue());
	System.out.println();
	System.out.println("How does " + r1.getA() + "/" + r1.getB() + " compare to " + r2.getA() + "/" + r2.getB() + "? " + r1.compareTo(r2));
    }
}
