import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;

    public Rational(int a, int b) {
	this.a=a; // a is numerator
	this.b=b; // b is denominator
	reduce();
    }

    public int getNum() {
	return a;
    }
    public int getDen() {
	return b;
    }

    public int gcd(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else {
	    return gcd(b,a%b);
	}
    }

    public void reduce() {
	int i;
	i = gcd(a,b);
	a = a / i;
	b = b / i;
    }

    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	return (this.a == other.a && this.b == other.b);
    }

    public Rational mult(Rational other) {
	int aNew,bNew;
	Rational r;
	aNew = this.a * other.a;
	bNew = this.b * other.b;
	r = new Rational(aNew,bNew);
	return r;
    }

    public int compareTo(Rational other) {
	if (this.a * other.b == other.a * this.b) {
	    return 0;
	}
	else if (this.a * other.b > other.a * this.b){
	    return 1;
	}
	else {
	    return -1;
	}
    }

    public String fraction() {
	String frac;
	frac = "" + getNum() + "/" + getDen();
	return frac;
    }

}
