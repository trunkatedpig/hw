import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Rational r1 = new Rational(1,1);
	System.out.println("Value: " + r1.getValue() + " a: " + r1.getA() + " b: " + r1.getB());
	r1.setNum(8);
	r1.setDenom(4);
	System.out.println("Set a as 8, b as 4\n" + "Value: " + r1.getValue() + " a: " + r1.getA() + " b: " + r1.getB());
	r1.reduce();
	System.out.println("After reducing \n" + "Value: " + r1.getValue() + " a: " + r1.getA() + " b: " + r1.getB());
	Rational r2 = new Rational(5,9);
	System.out.println("T/F, is r1 = r2? (r2 = 5/9)\n" + r1.equals(r2));
	Rational r3 = r1.mult(r2);
	System.out.println("Rational of r1*r2" + "Value: " + r3.getValue() + " a: " + r3.getA() + " b: " + r3.getB());
	System.out.println("If r3 > r2, output is 1,\nif r3 < r2, output is -1,\nif r3 = r2, output is 0.\nOutput = " + r3.compareTo(r2));
    }
}