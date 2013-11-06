import java.io.*;
import java.util.*;

public class Driver {
    
    public static void main (String[] args) {
	Rational a = new Rational(5,3);
	Rational b = new Rational(10,11);
	System.out.println(a.GetA(a));
	System.out.println(a.GetB(a));
	System.out.println(a.GetA(b));
	System.out.println(a.GetB(b));
	System.out.println(a.equals(b));
	System.out.println(a.gcd(a.GetA(a),a.GetB(a)));
	System.out.println(a.gcd(a.GetA(b),a.GetB(b)));
	System.out.println(a.gcd(10,12));
	System.out.println(a.GetA(a.mult(b)));
	System.out.println(a.GetB(a.mult(b)));
	System.out.println(a.compareTo(b));
    }
}