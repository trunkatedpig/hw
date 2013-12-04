import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;

    public Rational() {
	a = 1;
	b = 2;
    }

    public Rational(int x, int y) {
	a = x;
	b = y;
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }

    public double getReduce() {
	reduce();
	double p =(double)a / (double)b;
	return p;
    }

    public boolean equals(Rational other) {
	if (this.getReduce()==other.getReduce()) {
	    return true;
	}
	else {
	    return false;
	}    
    }

    public int getNumerator() {
	return a;
    }

    public int getDenominator() {
	return b;
    }

    public String getRational() {
	String A = "" + a;
	String B = "" + b;
	String ans = A + "/" + B;
	return ans;
    }

    public Rational mult(Rational other) {
	int x = other.getNumerator();
	int y = other.getDenominator();	
	Rational r = new Rational(a*x,b*y);
	return r;
    }

    public int compareTo(Rational other) {
	if (this.getReduce() > other.getReduce()) {
	    return 1;
	}
	else if (this.getReduce() < other.getReduce()) {
	    return -1;
	}
	else {
	    return 0;
	}
    }
}