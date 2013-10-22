import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Rational r,r2,r3,r4,r5,r6,r7,r8;

	r = new Rational(5,7);
	r2 = new Rational(8,10);
	System.out.println(r.equals(r2));

	r3 = new Rational(2,4);
	r4 = new Rational(5,10);
	System.out.println(r3.mult(r4).result());

	r6 = new Rational(6,9);
	r7 = new Rational(6,12);
	System.out.println(r6.compareTo(r7));
    }
}
