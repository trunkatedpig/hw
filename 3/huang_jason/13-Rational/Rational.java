import java.io.*;
import java.util.*;

public class Rational{

    private int a;
    private int b;

    public Rational(){
	a = 1;
	b = 1;
    }

    public Rational(int num, int den){
	a = num;
	b = den;
    }
    
    public int gcd(int x,int y) {
	if (y==0)
	    return x;
	else {
	    return gcd(y,x%y);
	} 
    }
    
    public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }

    public boolean equals(Rational other){
	other.reduce();
	this.reduce();
	if ((other.a == this.a)&&(other.b == this.b))
	    return true;
	else
	    return false;
    }

    public Rational mult(Rational other){
	int nprod = other.a * this.a;
	int dprod = other.b * this.b;
	Rational prod = new Rational(nprod,dprod);
	prod.reduce();
	return prod;
    }

    public String toString(){
	return "" + a + "/" + b;
    }

    public int compareTo(Rational other){
	if (a * other.b > b * other.a)
	    return 1;
	if (a * other.b < b * other.a)
	    return -1;
	else
	    return 0;
    }
}