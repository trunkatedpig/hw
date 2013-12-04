import java.io.*;
import java.util.*;

public class Rational {
    private int a;
    private int b;

    public Rational (int x, int y) {
	a = x;
	b = y;
    }

    public void setNum (int x) {
	a = x;
    }

    public void setDen (int y) {
	b = y;
    }
    
    public int getNum () {
	return a;
    }

    public int getDen () {
	return b;
    }

    public int gcd (int a, int b) {
	if (b == 0) {
	    return a;
	}
	else {
	    return gcd (b,a%b);
	}
    }

    public void reduce () {
	int x = gcd (a,b);
	a = a / x;
	b = b / x;
    }

    public boolean equals (Rational other) {
	reduce ();
	other.reduce ();
	if ((a == other.getNum ()) && (b == other.getDen ())) {
		return true;
	    }
	else {
		return false;
	}
    }

    public Rational mult (Rational other) {
	int newA = a * other.getNum ();
	int newB = b * other.getDen ();
	Rational x = new Rational (newA,newB);
	return x;
    }

    public int compareTo (Rational other) {
	reduce();
	other.reduce();
	if ((a == other.getNum()) && (b == other.getDen())) {
		return 0;
	}
	else {
	    Rational c = mult (new Rational (other.getDen(), other.getDen()));
	    Rational d = other.mult (new Rational (getDen(), getDen()));
	    if (c.getNum() > d.getNum()) {
		return 1;
	    }
	    else {
		return -1;
	    }
	}
    }
}

