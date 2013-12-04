import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;
    public Rational(int num, int den) {
	a=num;
	b=den;
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
    public int getA() {
	return a;
    }
    public int getB() {
        return b;
    }

    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	if (getA()==(other.getA()) && getB()==(other.getB()) ) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public Rational mult(Rational other) {
	int num, den;
	num = this.getA() * other.getA();
	den = this.getB() * other.getB();
	Rational r= new Rational(num,den);
	return r;
    }
    public int compareTo(Rational other) {
        Rational c= new Rational(this.getB(), this.getB());
	Rational d= new Rational(other.getB(),other.getB());
	Rational e=other.mult(c);
	Rational f=this.mult(d);
	if (this.equals(other)) {
            return 0;
        }
	else if (f.getA() > e.getA()) {
	    return 1;
	}
	else {
	    return -1;
	}
    }
	
}
