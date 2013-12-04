import java.io.*;
import java.util.*;

public class Rational{
    private int a,b;
   
    public Rational(int a, int b){
	this.a=a;
	this.b=b;
	this.reduce();
    }
    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else 
	    return gcd(b,a%b);
    } 
    public void reduce() {
	a = a / gcd(a,b);
        b = b / gcd(a,b);
    }
    public boolean equals(Rational other){
	return (other.a==this.a && other.b==this.b);
    }
    public Rational mult(Rational other){
	int t,b;
	Rational r;
	t=other.a*this.a;
	b=other.b*this.b;
	r=new Rational(t,b);
	return r;
    }
    public int compareTo(Rational other){
	double r1,r2;
	r1=((double) a)/((double) b);
	r2=((double)other.a)/((double)other.b);
	if (r1==r2){
	    return 0;
	}
	else if (r1>r2){
	    return 1;
	}
	else {
	    return -1;
		}
    }
}
