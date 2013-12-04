import java.io.*;
import java.util.*;

public class RationalDriver {
    public static void main(String[] args) {
	Rational P = new Rational(4, 6);
	Rational Q = new Rational(3, 2);
	Rational R = new Rational(9, 6);
	//reduce
        R.reduce();
	System.out.println(R);
	
	//equals
	System.out.println(R.equals(Q));
	System.out.println(P.equals(R));
	
	//mult
	System.out.println(R.mult(Q));
	System.out.println(P.mult(Q));
	
	//compareTo
	System.out.println(R.compareTo(P));
	System.out.println(P.compareTo(R));
	System.out.println(Q.compareTo(R));
    }
}
