import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Rational r1,r2,r3,r4;
	r1 = new Rational(3,5);
	r2 = new Rational(6,12);
	r3 = new Rational(18,90);
	r4 = new Rational(6,10);

	System.out.println(r3.getInfo()); //18,90
	System.out.println(r3.gcd(r3.geta(),r3.getb())); //18
	r3.reduce();
	System.out.println(r3.getInfo()); //1,5
	
	System.out.println(r1.equals(r4)); //true
	System.out.println(r1.equals(r2)); //false
	
	Rational r5 = r1.mult(r2);
	System.out.println(r5.getInfo()); //3,10

	System.out.println(r1.compareTo(r3)); //1
	System.out.println(r1.compareTo(r4)); //0
	System.out.println(r5.compareTo(r1)); //-1
    }
}
