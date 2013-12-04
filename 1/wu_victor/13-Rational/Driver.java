import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Rational r = new Rational(2, 3);
	Rational s = new Rational(5, 4);
	Rational t = new Rational(4, 6);

	System.out.println(r.compareTo(s));
	System.out.println(r.compareTo(t));
	System.out.println(s.compareTo(t));

	System.out.println("-------------------------");
	
	System.out.println(r.mult(s).getA());
	System.out.println(r.mult(s).getB());

	System.out.println(r.mult(t).getA());
	System.out.println(r.mult(t).getB());

	System.out.println(s.mult(t).getA());
	System.out.println(s.mult(t).getB());
	
	
	System.out.println("-------------------------");

	System.out.println(r.equals(s));

    }
}
