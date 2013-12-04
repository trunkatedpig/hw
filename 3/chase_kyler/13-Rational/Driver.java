import java.util.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Rational r1, r2;
		r1 = new Rational(4,6);
		r2 = new Rational(5,10);
		System.out.println(r1.equals(r2));
		System.out.println(r1.mult(r2).getValue());
		System.out.println(r2.compareTo(r1));
	}
}

