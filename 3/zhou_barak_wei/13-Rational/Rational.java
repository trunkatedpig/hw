import java.io.*;
import java.util.*;

public class Rational {
	private int a;
	private int b;
	
	public Rational(int numerator, int denominator) {
		a = numerator;
		b = denominator;
	}
	public Rational() {
		a = 0;
		b = 1;
	}
	
	public void seta(int numerator) {
		a = numerator;
	}
	public void setb(int denominator) {
		b = denominator;
	}
	
	public int gcd(int a,int b) {
		if (b==0)
			return a;
		else {
			return gcd(b,a%b);
		} 
    }
    
    public void reduce() {
		int n = gcd(a,b);
		a = a / n;
		b = b / n;
    }
	
	public int geta() {
		return a;
	}
	public int getb() {
		return b;
	}
	
	public boolean equals(Rational other) {
		return ((this.a/this.b) == (other.geta()/other.getb()));
	}
	public Rational mult(Rational other) {
		int newa = this.a * other.geta();
		int newb = this.b * other.getb();
		Rational result = new Rational(newa, newb);
		result.reduce();
		return result;
	}
	
	public int compareTo(Rational other) {
		if (this.b == 0 || other.b == 0) {
			throw new IllegalArgumentException("undefined");
		}
		else {
			return ((this.a/this.b) - (other.geta()-other.getb()));
		}
	}
	
	
}