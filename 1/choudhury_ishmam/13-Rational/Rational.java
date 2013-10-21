import java.io.*;
import java.util.*;

public class Rational {
	
	int a, b;
	
	public void setRational( int x, int y) {
		a = x;
		b = y;
	}
	
	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		else {
			return gcd(b,a%b);
		}
	}
	

	public void reduce() {
		a = a / gcd(a,b);
		b = b / gcd(a,b);
		}
		
	public boolean equals(Rational other) {
		other.reduce();
		this.reduce();
		boolean ae = this.a == other.getA(); 
		boolean be = this.b == other.getB();
		return ae && be;
	}
	
	public Rational mult(Rational other) {
		int oa = other.getA();
		int ob = other.getB();
		int ta = this.getA();
		int tb = this.getB();
		Rational r = new Rational();
		r.setRational( oa * ta , ob * tb );
		return r;
	}
	
	public int compareTo(Rational other) {
		if (this.getR() > other.getR()) {
			return 1;
		}
		else if (this.getR() == other.getR()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	//get 
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public double getR() {
		return a/b;
	}
}