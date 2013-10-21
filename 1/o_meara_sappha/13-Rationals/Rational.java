import java.io.*;
import java.util.*;

public class Rational {
    private int a;
    private int b;
    
    public Rational(int x, int y) {
	a = x;
	b = y;
    }
    
    public int getA() {
	return a;
    }
    
    public int getB() {
	return b;
    }
    
    public int gcd(int a,int b) {
	if (b == 0)
	    return a;
	else
	    return gcd(b, a % b);
    }

    public void reduce() {
        a = a / gcd(a, b);
	b = b / gcd(a, b);
    }
    
    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	return a == other.getA() && b == other.getB();
    }
    
    public Rational mult(Rational other) {
	int x = other.getA() * this.getA();
	int y = other.getB() * this.getB();
	Rational R = new Rational(x, y);
	return R;
    }
    
    public int compareTo(Rational other) {
	reduce();
	other.reduce();
	if (other.getA()/other.getB() > a/b)
	    return -1;
	else if (other.getA()/other.getB() < a/b)
	    return 1;
	return 0;
    }
}
