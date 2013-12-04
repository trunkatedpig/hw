import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Rational r = new Rational(4,3);
	Rational t = new Rational(8,6);
	System.out.println(r.equals(t));
	Rational q = new Rational(1,2);
	System.out.println(r.equals(q));
	Rational s = r.mult(q);
	System.out.println(s.toString());
	System.out.println(r.compareTo(t));
	System.out.println(r.compareTo(q));
	Rational u = new Rational(5,3);
	System.out.println(r.compareTo(u));
    }
}