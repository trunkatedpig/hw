import java.io.*;
import java.util.*;

public class Rational {
    private int n, d;
    // n is for numerator, d is for denominator, Rational --> n/d
    public Rational (int a, int b){
	n = a;
	d = b;
    }
    public int gcd (int a,int b){
	if (b == 0)
	    return a;
	else {
	    return gcd (b, a%b);
	}
    }
    public void reduce(){
	int f = gcd(n, d);
	n = n / f;
	d = d / f;
    }
    public boolean equals (Rational other){
	this.reduce();
	other.reduce();
	int n1, n2, d1, d2;
	n1 = this.getNumerator();
	d1 = this.getDenominator();
	n2 = other.getNumerator();
	d2 = other.getDenominator();
	return (n1 == n2 && d1 == d2);
    }

    public int getNumerator(){
	return n;
    }
    public int getDenominator(){
	return d;
    }

    public Rational mult(Rational other){
	int newnum, newden;
	newnum = this.getNumerator() * other.getNumerator();
	newden = this.getDenominator() * other.getDenominator();
	Rational r = new Rational(newnum, newden);
	return r;
    }
    
    public String toString(){
	return ("" + this.n + "/" + this.d);
    }

    public int compareTo (Rational other){
	double valuethis, valueother;
	valuethis = this.n/this.d;
	valueother = other.getNumerator()/other.getDenominator();
	if (this.equals(other))
	    return 0;
	else if (valuethis > valueother)
	    return 1;
	else
	    return -1;
    }
}