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
	n = n / gcd(n,d);
	d = d / gcd(n,d);
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
}