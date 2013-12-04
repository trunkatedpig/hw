import java.io.*;
import java.util.*;

public class Rational{
    int a,b;

    public Rational(int numerator, int denominator){
	a = numerator;
	b = denominator;
    }

    public int gcd(int i,int j){
	if (j == 0)
	    return i;
	else {
	    return gcd(j,i%j);
	}
    }
    
    public int getA(){
	return a;
    }

    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public double ratNum(){
	double num = (double)(a) / (double)(b);
	return num;
    }

    public boolean equals(Rational other){
	if (this.ratNum() == other.ratNum())
	    return true;
	else
	    return false;
    }

    public Rational mult(Rational other){
	Rational newRat;
	newRat = new Rational(this.a * other.a,this.b * other.b);
	newRat.reduce();
	return newRat;
    }

    public int compareTo(Rational other){
	if (this.ratNum() == other.ratNum())
	    return 0;
	else if (this.ratNum() > other.ratNum())
	    return 1;
	else
	    return -1;
    }
}

   
