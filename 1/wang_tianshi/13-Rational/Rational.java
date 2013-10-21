import java.io.*;
import java.util.*;

public class Rational {
    
    private int a, b;

    public Rational(int num, int den) {
	a = num;
	b = den;
    }
    
    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }	
	
    public void reduce() {
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }

    public int getNum() {
	return a;
    }
    public int getDen() {
	return b;
    }

    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	return this.getNum() == other.getNum() 
	    && this.getDen() == other.getDen();
    }
    
    public Rational mult(Rational other) {
	this.reduce();
	other.reduce();
	int newNum = this.getNum() * other.getNum();
	int newDen = this.getDen() * other.getDen();
	Rational ans = new Rational(newNum, newDen);
	ans.reduce();
	return ans;
    }

    public int compareTo(Rational other) {
	if (this.equals(other)) {
	    return 0;
	}
	else if ((double)this.getNum()/this.getDen()>
		 (double)other.getNum()/other.getDen()) {
	    return 1;
	}
	else
	    return -1;
    }
}


    
