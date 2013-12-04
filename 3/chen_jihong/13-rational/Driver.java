import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main (String[] args) {
	Rational x = new Rational(23,5);
	Rational y = new Rational(8,5);
	System.out.println(x.getA(x));
	System.out.println(x.getB(x));
	System.out.println(x.getA(y));
	System.out.println(x.getB(y));
	System.out.println(x.equals(y));
	System.out.println(x.gcd(x.getA(x),x.getB(x)));
	System.out.println(x.gcd(x.getA(y),x.getB(y)));
	System.out.println(x.gcd(250,30));
	System.out.println(x.getA(x.mult(y)));
	System.out.println(x.getB(x.mult(y)));
	System.out.println(x.compareTo(y));
    }
}