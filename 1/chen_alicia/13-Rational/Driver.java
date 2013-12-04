import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String [] args){
	Rational R = new Rational(1,4);
	Rational S = new Rational(1,2);
	Rational T = new Rational(2,8);

	System.out.println(R.equals(S));
	System.out.println(R.equals(T));

	Rational U = R.mult(S);
	Rational V = R.mult(T);
	System.out.println("U = "+ U.getA() + "/"+  U.getB());
	System.out.println("V = "+ V.getA() + "/" + V.getB());


	System.out.println(R.compareTo(S));
	System.out.println(R.compareTo(T));
	System.out.println(S.compareTo(R));
	System.out.println(U.compareTo(T));
    }
}

		    
