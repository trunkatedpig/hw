import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String [] args) {
	
	Rational r, r1, r2;

	r = new Rational();
	r.setRational(15,7);

	r1 = new Rational();
	r1.setRational(4,2);

	r2 = new Rational();
	r2.setRational(16,8);

	System.out.println(r1.equals(r2));
	System.out.println(r.mult(r1));
	System.out.println(r.compareTo(r1));
	System.out.println(r1.compareTo(r2));
	
    }
}

