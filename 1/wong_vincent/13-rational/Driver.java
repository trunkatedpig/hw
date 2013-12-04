import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
	Rational r = new Rational(10,10);
	Rational s = new Rational(9,10);

	System.out.println(r.equals(s));

	System.out.println(r.mult(s).getA());
	System.out.println("--");
	System.out.println(r.mult(s).getB());

	System.out.println(r.compareTo(s));
	//r.mult(Rational other);
	//r.compareTo(Ratoinal other);
    }
    
}

