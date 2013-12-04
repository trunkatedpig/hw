import java.io.*;
import java.util.*;

public class Rational {
    public int den, num;
    //private String ratio;

    public Rational(int a, int b) {
	num = a;
        den = b;
	//ratio = Integer.toString(num) + "/" + Integer.toString(den);
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    } 

    public void reduce() {
	num = num / gcd(num,den);
	den = den / gcd(num,den);
    }
    public boolean equals(Rational other) {
	// Having trouble with equals through reduce method; 
	// will reduce numerator, but not denominator. 
        /*this.reduce();
        other.reduce();
	if ((this.num == other.num) && (this.den == other.den)) {
		return true;
	}
        return false;*/
	double n = (this.num / this.den);
	double d = (other.num / other.den);
	if (n == d) {
	    return true;
	} 
	return false;
    }
    
    public Rational mult(Rational other) {
	// Because reduce will not work with my denominator, this method also has a problem when working with rationals that have already been reduced
	int n = (this.num * other.num);
	int d = (this.den * other.den);
	Rational r = new Rational(n,d);
	return r;
    }

    public int compareTo(Rational other) {
	double a = (other.num/other.den);
	double b = (this.num/this.den);
	if (a == b) {
	    return 0;
	}
	else if (a > b) {
	    return 1;
	}
	else {
	    return -1;
	}
    }

	    
}
	   
    



