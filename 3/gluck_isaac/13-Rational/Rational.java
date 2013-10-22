import java.util.*;
import java.io.*;

public class Rational {
    private int num, den;

    //Constructors
    public Rational() {
	num = 1;
	den = 1;
    }

    public Rational(int n, int d) {
	num = n;
	den = d;
    }

    //

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	num = num / gcd(num, den);
	den = den / gcd(num, den);
    }

    public int getNum() {
	return num;
    }

    public int getDen() {
	return den;
    }
    
    public boolean equals(Rational other) {
	other.reduce();
	this.reduce();

	if (other.getNum()==this.getNum() && other.getDen()==this.getDen())
	    return true;
	else
	    return false;
    }

    public Rational mult(Rational other) {
	int newNum = other.getNum() * this.getNum();
	int newDen = other.getDen() * this.getDen();
	Rational r = new Rational(newNum, newDen);
	return r;
    }

    public int compare(Rational other) {
	this.reduce();
	other.reduce();
	
	if (this.equals(other))
	    return 0;
	
	double t =  this.getNum()/this.getDen();
	double o = other.getNum()/other.getDen();
	if (t > 0)
	    return 1;
	else
	    return -1;
    }
}
