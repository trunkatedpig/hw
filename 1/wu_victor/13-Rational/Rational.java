import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;

    public Rational () {
	Random r = new Random();
	a = r.nextInt(10) + 1;
	b = r.nextInt(10) + 1;
    }

    public Rational (int x, int y) {
	a = x;
	b = y;
    }

    public int gcd (int a, int b) {
	if (b == 0)
	    return a;
	else
	    return gcd(b, a%b);
    }

    public void reduce () {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public boolean equals (Rational other) {
	if (a == other.getA() && b == other.getB()) {
	    return true;
	}
	else
	    return false;
    }

    
    public Rational mult (Rational other) {
	Rational z = new Rational();
	
	z.setA(a * other.getA());
	z.setB(b * other.getB());
       
	z.reduce();

	return z;
    }
    

    public int compareTo (Rational other) {
	this.reduce();
	other.reduce();
	
	if (a == other.getA() && b == other.getB()) {
	    return 0; 
	}
	else if ( a/b > other.getA()/other.getB()) {
	    return 1;
	}
	else {
	    return -1; 
	}
    }

    public int getA () {
	return a;
    }
    public int getB () {
	return b;
    }
    public void setA (int x) {
	a = x;
    }
    public void setB (int y) {
	b = y;
    }

}

