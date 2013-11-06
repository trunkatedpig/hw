import java.io.*;
import java.util.*;

public class Rational{
    int a,b;
    public Rational(int a, int b) {
	this.a=a; 
	this.b=b; 
	reduce();
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
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
    
    public int getNumerator(){
	return a;
    }
    public int getDenominator(){
	return b;
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

    public String fract() {
	this.reduce();
	return "" + a + "/" + b;
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
}
