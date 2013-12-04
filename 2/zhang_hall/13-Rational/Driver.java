import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	
	Rational r1, r2, r3, r4, r5, r6, r7, r8;
	//First two examples with equal rational numbers
       	r1 = new Rational(8, 7);
       	r2 = new Rational(8, 7);
	System.out.println("Using two equal rational numbers");
       	System.out.println(r1.equals(r2));
	System.out.println(r1.mult(r2).getA() + "/" + r1.mult(r2).getB());    
 	System.out.println(r1.compareTo(r2));
	System.out.println("\n");

	//Next two examples with unequal rational numbers
      	r3 = new Rational(8, 7);
	r4 = new Rational(10, 2);
       	System.out.println("Using two unequal rational numbers");
	System.out.println(r3.equals(r4));
       	System.out.println(r3.mult(r4).getA() + "/" + r3.mult(r4).getB());
       	System.out.println(r3.compareTo(r4));
       	System.out.println("\n");

	//Unequal rational numbers, but with positions reversed;
	r5 = new Rational(10, 2);
	r6 = new Rational(8, 7);
	System.out.println("Same numbers as previous scenario, but orders reversed to test compareTo");
	System.out.println(r5.equals(r6));
	System.out.println(r5.mult(r6).getA() + "/" + r5.mult(r6).getB());
	System.out.println(r5.compareTo(r6));
	System.out.println("\n");

	//Two examples with equal rational numbers but not reduced
	r7 = new Rational(8, 7);
	r8 = new Rational(16, 14);
	System.out.println("Using two equal rational numbers, but with not in simplist terms");
	System.out.println(r7.equals(r8));
	System.out.println(r7.mult(r8).getA() + "/" + r7.mult(r8).getB());
	System.out.println(r7.compareTo(r8));
    }
}
