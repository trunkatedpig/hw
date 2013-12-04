import java.io.*;
import java.util.*;

public class Rational {
    private int n,d;
    
    public Rational (int a,int b) {
	n = a;
	d = b;
    }

    public void setNum (int t) {
	t = n;
    }

    public void setDenom (int r) {
	r = d;
    }

    public int getNum () {
	return n;
    }

    public int getDenom () {
	return d;
    }

    public double result () {
	double r;
	r = n / d;
	return r;
    }
    
    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }
    
    public void reduce() {
	int g = gcd(n,d);
	n = n / g;
	d = d / g;
    }

    public boolean equals(Rational other) {
	reduce();
	other.reduce();
	if (result() == other.result()) {
	    return true;
	} else {
	    return false; }
    }
    
    public Rational mult(Rational other) {
	Rational r1;
	int top,bottom;
	top = n * other.getNum();
	bottom = d * other.getDenom();
	r1 = new Rational(top,bottom);
	r1.reduce();
	return r1;
    }

    public int compareTo(Rational other) {
	double f = result(),g = other.result();
	if (f == g) {
	    return 0;
	} else if (f < g) {
	    return -1;
	} else {
	    return 1; }
    }
}
