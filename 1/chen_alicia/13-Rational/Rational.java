import java.io.*;
import java.util.*;

public class Rational{
    private int a;
    private int b;

    public Rational(int i, int j){
	a = i;
	b = j;
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} }

    public void reduce() {
	int n = gcd(a,b);
	a = a /n ;
	b = b /n;
    }

    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public boolean equals(Rational other){
	this.reduce();
	other.reduce();
	if ((this.getA() == other.getA()) && (this.getB() == other.getB())) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
    public Rational mult (Rational other){
	int newNum = this.getA() * other.getA();
	int newDen = this.getB() * other.getB();
	Rational r = new Rational (newNum, newDen);
	r.reduce();
	return r;
    }
    //needs revising > doesnt seem to work
    public int compareTo(Rational other){
	int result;
	this.reduce();
	other.reduce();
	if (this.equals(other)) {
	    result = 0;
	}
	else {
	    Rational s = this.mult( new Rational(other.getB(),other.getB()));
	    Rational t = other.mult(new Rational(this.getB(),this.getB()));
	    if (s.getA() > t.getA()){
		result = 1;
	    }
	    else {
		result = -1;
	    }
	}
	return result;
	
    }
}

		
	
       
	
    
	
