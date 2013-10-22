import java.io.*;
import java.util.*;

public class Rational {

/* Variable int a represents the numerator */
	private int a;
/* Variable int b represents the denominator */
	private int b;
	private String fraction;

	public Rational(int a, int b){
		if (a == 0) {
			setNumerator(a);
			setDenominator(b);
			fraction = "0";
		}
		else if (b != 0) {
			setNumerator(a);
			setDenominator(b);
			setFraction(a,b);
		}
		else
			fraction = "undefined";
	}

/* Basic set methods for numerator and denominator */
	 public void setNumerator(int m){
		a = m;
	}

	public void setDenominator(int n) {
		b = n;
	}

	public void setFraction(int m, int n) {
		fraction = m + "/" + n;
	}

/*Basic get methods to retrive the numerator and the denominator */
	public int getNumerator() {
		return a;
	}

	public int getDenominator() {
		return b;
	}

	public String getFraction() {
		return fraction;
	}

/* Method that tests for the gcd between the numerator and the denominator */
	public int gcd(int a,int b) {
		int c = Math.min(a,b);
			while (a%c!=0 || b%c!=0) {
				c = c -1;
			}
		return c;
	}

/* Method that will reduce/simplify a fraction if a gcd is present */
    public void reduce() {
		if (fraction == "undefined")
			fraction = "undefined";
		else if(a == 0)
			fraction = "0";
		else {
			int n = gcd(a,b);
			a = a / n;
			b = b / n;
			setFraction(a,b);
		}
    }

/*Method that will tell whether two rational numbers are equal or not */
 	public boolean equals(Rational other){
		this.reduce();
		other.reduce();
		return(a == other.a && b == other.b);
	}

/*Method that will mulitply two rational numbers and create a NEW rational*/
	public Rational mult(Rational other) {
		this.reduce();
		other.reduce();
		if (fraction == "undefined" || other.fraction == "undefined")
			return new Rational(1,0);
		else if (fraction == "0" || other.fraction == "0")
			return new Rational(0,0);
		else {
			int newA = a * other.a;
			int newB = b * other.b;
			return new Rational(newA,newB);
		}
	}

/*Method that will compare the values of two rational numbers:
	-if the two rationals are equal, return 0
	-if THIS rational is greater than OTHER rational, return 1
	-if THIS rational is less than OTHER rational, return -1 */
	public int compareTo(Rational other) {
		int result = 0;
		this.reduce();
		other.reduce();
		int partA = ((a * other.b) - (other.a * b));
		int partB = b * other.b;
		double n = ((double) partA / (double) partB);
		if (n < 0)
			result = -1;
		else if (n == 0)
			result = 0;
		else
			result = 1;
		return result;
		}

}