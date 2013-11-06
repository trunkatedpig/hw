import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Rational a = new Rational(1,3);
	Rational b = new Rational(3,9);
	Rational c = new Rational(1,9);

	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(a.mult(b));
	System.out.println(b.mult(c));
	System.out.println(a.compareTo(b));
	System.out.println(a.compareTo(c));
    }
}
