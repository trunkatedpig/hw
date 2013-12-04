import java.util.*;
import java.io.*;

public class Rational{
    public int a;
    public int b;
    public double c;
    public int gcd(int a,int b){
	if (b==0){
	    return a;
	}
	else{
	    return gcd(b,a%b);
	}
    }
    public Rational(int a,int b){
	this.a = a;
	this.b = b;
	reduce();
	this.c = (double) (this.a) / this.b;
    }
    public int geta(){
	return a;
    }
    public int getb(){
	return b;
    }
    public double getc(){
	return c;
    }
    public void reduce(){
	int n = gcd(this.a,this.b);
	this.a = this.a / n;
	this.b = this.b / n;
    }
    public boolean equals(Rational other){
	if (this.c == other.c)
	    return true;
	else
	    return false;
    }
    public Rational mult(Rational other){
	int i = a * other.a;
	int j = b * other.b;
	Rational r = new Rational(i,j);
	return r;
    }
    public int compareTo(Rational other){
	if (this.equals(other))
	    return 0;
	else if (this.c>other.c)
	    return 1;
	else
	    return -1;
    }
}
