import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Rational r1,r2,r3,r4;
	r1 = new Rational(4,8); 
	r2 = new Rational (1,2);
	r3 = new Rational (3,9);
	r4 = new Rational (2,7);
	System.out.println(r1.equals(r2)); // true
	System.out.println(r2.equals(r3)); // false
	System.out.println(r4.equals(r1)); // false
	
	Rational p1,p2,p3,p4;
	p2 = r1.mult(r3);
	System.out.println(r1.fraction()+" * "+r3.fraction()+" = "+p2.fraction());
	p1 = r2.mult(r4);
	System.out.println(r2.fraction()+" * "+r4.fraction()+" = "+p1.fraction());
	p3 = r3.mult(r4);
	System.out.println(r3.fraction()+" * "+r4.fraction()+" = "+p3.fraction());
	p4 = r1.mult(r2);
	System.out.println(r1.fraction()+" * "+r2.fraction()+" = "+p4.fraction());

	System.out.println(r1.compareTo(r2));
	System.out.println(r3.compareTo(r4));
	System.out.println(r4.compareTo(r1));

    }
}
