import java.util.*;
import java.util.*;

public class Rational {
	private int a;
	private int b;
	private double value;

	public Rational(int x, int y) {
		setAB(x,y);
		value = (1.0 * x) / (1.0 * y);
	}

	public void setAB(int x, int y) {
		a = x;
		b = y;
	}

	public int gcd(int a, int b) {
		int c;
		if (b > a)
			c = a;
		else
			c = b;
		while (c > 1) {
			if (b % c ==0 && a % c == 0)
				return c;
			else
				c = c - 1;
		}
		return c;
	}

	public void reduce() {
		int x = gcd(a,b);
		a = a / x;
		b = b / x;
	}

	public int getA() {
		return a;}

	public int getB() {
		return b;}

	public double getValue() {
		return value;}

	public boolean equals(Rational other) {
		reduce();
		other.reduce();
		if (getA() == other.getA() && getB() == other.getB())
			return true;
		else
			return false;
	}

	public Rational mult(Rational other) {
		int a1 = a * other.getA();
		int b1 = b * other.getB();
		Rational result = new Rational(a1,b1);
		return result;
	}

	public int compareTo(Rational other) {
		if (equals(other))
			return 0;
		else if (getValue() > other.getValue())
			return 1;
		else
			return -1;
	}










}
