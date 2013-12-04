import java.io.*;
import java.util.*;

public class Rational {
    
    private int a,b;
    
    public Rational() {
	setA(1);
	setB(1);
    }
    
    public int getA(Rational other) {
	return other.a;
    }

    public int getB(Rational other) {
	return other.b;
    }

    public void setA(int x){
	a = x;
    }
    
    public void setB(int x){
	b = x;
    }
    
    public Rational(int x, int y) {
	setA(x);
	setB(y);
    }
    
    public int gcd(int a,int b){
	if (b==0) {
	    return a;
	}
	else {
	    return gcd(b,a%b);
	}
    }
    
    public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }
    
    public boolean equals (Rational other) {
	other.reduce();
	if (getA(other) == (a/gcd(a,b)) && getB(other) == (b/gcd(a,b))) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
    public Rational mult(Rational other) {
	Rational x = new Rational();
	x.setA(a * other.getA(other));
	x.setB(b * other.getB(other));
	return x;
    }
    
    public int compareTo(Rational other) {
	int x = 1;
	other.reduce();
	if (other.getB(other) * a == other.getA(other) * b) {
	    x = 0;
	}
	else if (other.getA(other) * b > other.getB(other) * a) {
	    x = -1;
	}
	else if (other.getB(other) * a > other.getA(other) * b) {
	    x = 1;
	}
	return x;
    }
}