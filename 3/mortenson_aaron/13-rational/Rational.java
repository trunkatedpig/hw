import java.util.*;
import java.io.*;

public class Rational {
    private int a;
    private int b;
    
    Rational (int top, int bot) {
	a = top;
	b = bot;
    }

    public String toString() {
	return a + "/" + b;
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
	    return gcd(b,a%b);
    }
    
    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public boolean equals (Rational other) {
	Rational we = this;
	Rational they = other;
	we.reduce();
	they.reduce();
	return we.getA() == they.getA() && we.getB() == they.getB();
    }

    public Rational mult (Rational other) {
	return new Rational (this.getA() * other.getA(), this.getB() * other.getB());
    }

    public int compareTo (Rational other) {
	if (this.equals (other))
	    return 0;
	if (this.a * other.b > other.a * this.b)
	    return 1;
	return -1;
    }
}