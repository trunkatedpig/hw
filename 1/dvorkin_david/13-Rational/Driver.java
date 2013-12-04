import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
        Rational r = new Rational(4,3);
        Rational s = new Rational(1,2);

	System.out.println(r.equals(s));
	System.out.println("===================");
	Rational x = r.mult(s);
	System.out.println(x.getA());
	System.out.println(x.getB());
	System.out.println("===================");
	System.out.println(r.compareTo(s));
    }
}
