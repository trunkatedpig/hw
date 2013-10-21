import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Rational r1 = new Rational(1,0);
	Rational r2 = new Rational(3,53);
	Rational r3 = new Rational(6,106);
	Rational r4 = new Rational(6,7);
	Rational r5 = r2.mult(r4);

	System.out.println("3/53 > 6/106? " +  r2.compare(r3));
	System.out.println("3/53 > 6/7? " + r2.compare(r4));
	System.out.println("3/53 * 6/7 = " + r5.getN() + "/ " + r5.getD());


    }



}
