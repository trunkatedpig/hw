import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
	Rational r = new Rational(3, 8);
	Rational r2= new Rational(6, 16);
	r2.reduce();
	System.out.println(r2.getNumerator());
	System.out.println(r2.getDenominator());
	System.out.println(r.getNumerator());
	System.out.println(r.getDenominator());
	System.out.println(r.equals(r2));
	Rational m = r.mult(r2);
	System.out.println(m.fract());
	System.out.println(r.compareTo(r2));
    }
}
