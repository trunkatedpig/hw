import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
	Rational r1 = new Rational(1,2);
	Rational r2 = new Rational(3,4);
	System.out.println(r1.equals(r2));
        Rational r3 = (r1.mult(r2));
	Rational r4 = new Rational(3,8);
	System.out.println(r1.compareTo(r2));
	System.out.println(r3.compareTo(r4));
    }
}
