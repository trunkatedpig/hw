import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Rational a = new Rational (1,2);
	Rational b = new Rational (2,3);
	Rational c = new Rational (3,6);
	System.out.println (a.equals (b));
	System.out.println (a.equals (c));
	Rational d = a.mult(b);
	System.out.println (d.getNum() + "/" + d.getDen());
	System.out.println (a.compareTo (c));
	System.out.println (a.compareTo (d));
	System.out.println (d.compareTo (a));
    }
}
