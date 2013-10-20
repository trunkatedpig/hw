import java.io.*;
import java.util.*;

public class Rational {
    
    private int a,b;
    
    public Rational() {
	SetA(1);
	SetB(1);
    }
    
    public int GetA(Rational other) {
	return other.a;
    }

    public int GetB(Rational other) {
	return other.b;
    }

    public void SetA(int x){
	a = x;
    }
    
    public void SetB(int x){
	b = x;
    }
    
    public Rational(int x, int y) {
	SetA(x);
	SetB(y);
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
	if (GetA(other) == (a/gcd(a,b)) && GetB(other) == (b/gcd(a,b))) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
    public Rational mult(Rational other) {
	Rational x = new Rational();
	x.SetA(a * other.GetA(other));
	x.SetB(b * other.GetB(other));
	return x;
    }
    
    public int compareTo(Rational other) {
	int x = 1;
	other.reduce();
	if (other.GetB(other) * a == other.GetA(other) * b) {
	    x = 0;
	}
	else if (other.GetA(other) * b > other.GetB(other) * a) {
	    x = -1;
	}
	else if (other.GetB(other) * a > other.GetA(other) * b) {
	    x = 1;
	}
	return x;
    }
}