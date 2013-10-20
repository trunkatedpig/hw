import java.util.*;
import java.io.*;

public class Rational{
    private int a,b;
    
    public Rational(){
	a = 1;
	b = 1;
    }
    public Rational(int x, int y){
	a = x;
	b = y;
    }
    /////////////////////////////////////////
    public void setA(int x){
	a = x;
    }
    public void setB(int y){
	if (y==0)
	    System.out.println("Cannot set 0 as denominator");
	else
	    b = y;
    }
    ///////////////////////////////////////
    public int getA(){
	return a;
    }
    public int getB(){
	return b;
    }
    /////////////////////////////////////
    public int gcd(int a,int b){
	if (b==0)
	    return a;
	else
	    return gcd(b, a%b);
    }
    public void reduce(){
	a = a/gcd(a,b);
	b = b/gcd(a,b);
    }

    public boolean equals(Rational other){
	reduce();
	other.reduce();
	if (getA() == other.getA() && getB() == other.getB())
		return true;
	else
	    return false;
    }
    public Rational mult(Rational other){
	Rational r = new Rational(getA()*other.getA(),getB()*other.getB());
	r.reduce();
	return r;
    }
    public int compareTo(Rational other){
	reduce();
	other.reduce();
	int xa = getA();
	int xb = getB();
	int ya = other.getA();
	int yb = other.getB();
	if (xa == ya && xb == yb)
	    return 0;
	else if ((double)xa/(double)xb > (double)xa/(double)xb)
	    return 1;
	else
	    return -1;
    }
}
