import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rational r = new Rational(3,4);
	Rational s = new Rational(6,8);
	Rational t = new Rational (1,2);
	System.out.println("equals routine: " + r.equals(s) + " (should return true)");

	System.out.println("mult routine: " + r.mult(s) +  " (should return an adress)");

	System.out.println("compare routine: " + r.compareTo(s) + " (should be 0)");

	System.out.println("compare routine: " + r.compareTo(t) + " (should be 1)");
	System.out.println("compare routine: "+ t.compareTo(r) + " (should be -1)");
    }
}
