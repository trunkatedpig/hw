import java.io.*;
import java.util.*;

public class Rational{
    private int a,b;

    public Rational(int a, int b){
	this.a = a;
	this.b = b;
	this.reduce();
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }

    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public Boolean equals(Rational other){
	return (a == other.a && b == other.b);
    }

    public Rational mult(Rational other){
	int newa, newb;
	Rational newr;
        newa = other.a * this.a;
	newb = other.b * this.b;
	newr = new Rational(newa, newb);
	return newr;	
    }

    public int compareTo(Rational other){
	double qthis, qother;
	qthis = ((double) this.a) / ((double) this.b);
	qother = ((double) other.a) / ((double) other.b);
	if (qthis > qother)
	   return 1;
	else if(qthis == qother)
	    return 0;
	else
	    return -1;	
    }
}
