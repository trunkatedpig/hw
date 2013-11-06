import java.io.*;
import java.util.*;

public class Rational{
    public int num,den;

    public Rational(int n,int d){
	num = n;
	den = d;
    }

    public void setNum(int n){
	num = n;
    }

    public void setDen(int d){
	den = d;
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    } 

    public void reduce() {
	int n = gcd(num,den);
	num = num / den;
	den = den / num;
    }

    public boolean equals(Rational other){
	this.reduce();
	other.reduce();
	if (this.num == other.num && this.den == other.den){
	    return true;
	}
	return false;
    }

    public Rational mult(Rational other){
	int n,d;
	n = this.num * other.num;
	d = this.den * other.den;
	Rational result = new Rational(n,d);
	result.reduce();
	return result;
    }
    
    public int compareTo(Rational other){
	this.reduce();
	other.reduce();
	if (equals(other)){
	    return 0;
	}	
	return 1;
    }
}
