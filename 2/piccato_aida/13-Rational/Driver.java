import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Rational a = new Rational(1,2);
	Rational b = new Rational(2,4);
	System.out.println(a.equals(b));
	Rational c = a.mult(b);
	System.out.println(a.compareTo(b));
    }
}
