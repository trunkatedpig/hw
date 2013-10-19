import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;

    public Rational(int a, int b) {
	this.a=a; // a is numerator
	this.b=b; // b is denominator
	reduce();
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
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	return (this.a == other.a && this.b == other.b);
    }

    public int getNum() {
	return a;
    }
    public int getDen() {
	return b;
    }
}
