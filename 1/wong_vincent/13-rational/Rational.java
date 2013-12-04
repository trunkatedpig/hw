import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;

    public Rational (int x, int y) {
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
	if (b==0)
	    return a;
	else{
	    return gcd(b,a%b);
	}
    }

    public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }

    public boolean equals(Rational other) {
	reduce();
	other.reduce();
	return a==other.getA() && b==other.getB();
    }

    public Rational mult(Rational other) {
	int i = a * other.getA();
	int j = b * other.getB();
	Rational p = new Rational (i,j);
	return p;
    }

    public int compareTo(Rational other){
	int p = -1;
	if (equals(other))
	    p = 0;
	if (a/b > other.getA()/other.getB())
	    p = 1;
	return p;
    }
}

