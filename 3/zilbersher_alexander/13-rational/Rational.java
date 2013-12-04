import java.io.*;
import java.util.*;

public class Rational {

    private double a,b,value;

    public Rational(double i,double j) {
	a = i;
	b = j;
	value = a/b;
    }

    public void setNum(double i) {
	a = i;
	value = a/b;
    }
    
    public void setDenom(double i) {
	b = i;
	value = a/b;
    }
    
    public double getA() { 
	return a;
    }

    public double getB() { 
	return b;
    }

    public double getValue() { 
	return value;
    }

    public double gcd(double a,double b) {
	if (b==0) {
	    return a;
	} else {
	    return gcd(b,a%b);
	}
    } 

    public void reduce() {
	double i = a;
	a = a / gcd(a,b);
	b = b / gcd(i,b);
	value = a/b;
    }

    public boolean equals(Rational other) {
	if (other.getValue() == value) {
	    return true;
	} else { 
	    return false;
	}
    }

    public Rational mult(Rational other) {
	Rational r = new Rational(a*other.getA(),b*other.getB());
	return r;
    }

    public int compareTo(Rational other) {
	if (other.getValue() > value) {
	    return 1;
	} else if (other.getValue() < value) {
	    return -1;
	} else { 
	    return 0;
	}
    }
}
