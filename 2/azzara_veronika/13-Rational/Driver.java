import java.io.*;

public class Driver{
    public static void main(String [] args){
	Rational r = new Rational(3,4);
	Rational r2 = new Rational(2,5);
	Rational r3 = new Rational(3,4);
	System.out.println(r.equals(r2));
	System.out.println(r.equals(r3));
	Rational r4 = r.mult(r2);
	Rational r5 = r.mult(r3);
	System.out.println(r4.getN());
	System.out.println(r4.getD());
	System.out.println(r5.getN());	
	System.out.println(r5.getD());
	System.out.println(r.compareTo(r2));
	System.out.println(r.compareTo(r3));
	System.out.println(r2.compareTo(r));
    }
}
