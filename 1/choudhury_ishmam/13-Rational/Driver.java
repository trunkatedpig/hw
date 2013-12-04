import java.io.*;
import java.util.*;

public class Driver {
	
	public static void main( String[] args) {
		Rational a = new Rational();
		a.setRational(24,6);
		Rational b = new Rational();
		b.setRational(35,7);
		a.reduce();
		b.reduce();
		System.out.println(a.getR());
		System.out.println(b.getR());
		System.out.println(a.compareTo(b));
		System.out.println(b.mult(a));
	}
}		