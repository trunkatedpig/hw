import java.io.*;
import java.util.*;

public class Rational {

    private int num, den;
    private double value;

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }

    public void reduce() {
	num = num / gcd(num,den);
	den = den / gcd(num,den);
    }

    public Rational(int top, int bot) {
	if (bot != 0) {
	    num = top;
	    den = bot;
	    value = (num/den);
	}
    }

    public int getNum() {
	return num;
    }

    public int getDen() {
	return den;
    }

    public double getValue() {
	return value;
    }

    public boolean equals(Rational other) {
	return ((this.num == other.getNum()) && (this.den == other.getDen()));
    }

    public Rational mult(Rational other) {
	Rational r;
	int newNum, newDen;

	newNum = this.num * other.getNum();
	newDen = this.den * other.getDen();

	r = new Rational(newNum, newDen);
	r.reduce();

	return r;
    }

    public int compareTo(Rational other) {
	int i = 0;

	if (this.num * other.getDen() > this.den * other.getNum()) {
	    i = 1;
	}
	else if (this.num * other.getDen() == this.den * other.getNum()) {
	    i = 0;
	}
	else if (this.num * other.getDen() < this.den * other.getNum()) {
	    i = -1;
	}

	return i;
    }

}