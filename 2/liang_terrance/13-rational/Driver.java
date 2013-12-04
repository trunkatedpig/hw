import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String [] args){
	Rational a,b,c;
	a = new Rational (2,3);
	b = new Rational (1,2);
	c = new Rational (3,6);

	System.out.println(b.equals(c));
	//Should be true
	System.out.println(a.equals(b));
	//Should be false	

	Rational d;
	d = a.mult(b);
	//Should equal 1/3
	System.out.println(d.getA() + "/" + d.getB());

	System.out.println(d.compareTo(a));
	//Should yield -1
	System.out.println(a.compareTo(c));
	//Should yield 1
	System.out.println(b.compareTo(c));
	//Should yield 0

    }
}
