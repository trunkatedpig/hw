import java.io.*;
import java.util.*;

public class Rational {
    private int a;
    private int b;
    private double value;

    public Rational(int x, int y) {
	a = x;
	b = y;
	value = (x * 1.0) / (y * 1.0);
    }
    
    public int gcd(int a,int b) {
	if (b == 0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
    
    public int getA() {
	return a;
    }

    public int getB() {
	return b;
    }

    public double getValue() {
	return value;
    }
    
    public boolean equals(Rational other) {
	return (this.getValue() == other.getValue());
    }
    
    public Rational mult(Rational other) {
	int x = a * other.getA();
	int y = b * other.getB();
	Rational r = new Rational(x,y);
	return r;
    }
    
    public int compareTo(Rational other) {
	if (this.equals(other))
	    return 0;
	else if (this.getValue() > other.getValue())
	    return 1;
	else
	    return -1;
    }
}
