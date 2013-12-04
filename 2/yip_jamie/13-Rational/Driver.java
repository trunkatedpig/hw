import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Rational a = new Rational(2,3);
	Rational b = new Rational (5,4);
	System.out.println(a.equals(b));
	System.out.println(a.mult(b));
	System.out.println(a.compareTo(b));
    }
}
