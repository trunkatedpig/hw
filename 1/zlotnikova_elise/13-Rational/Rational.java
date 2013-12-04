import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;
    
    public Rational(int x,int y) {
	if (y !=0) { 
	    a = x;
	    b = y;
	}
    }
    
    public int getA() {
	return a;
    }
    public int getB() {
	return b;
    }
    
    public int gcd(int a,int b) { 
	if (b==0)
	    return a;
	else { 
	    return gcd(b,a%b);
	}
    }
    
    public void reduce() {
	int z = gcd(a,b);
	a = a / z;
	b = b / z;
    }

    public boolean equals(Rational other) { 
	this.reduce();
	other.reduce();
	if (this.getA()==other.getA() && this.getB()==other.getB()) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
    public Rational mult(Rational other) {
	int x = this.getA() * other.getA();
	int y = this.getB() * other.getB(); 
	Rational rational;
        rational = new Rational(x,y);
	return rational;
    }

    public int compareTo(Rational other) { 
	int x=0;
	if (this.equals(other)) {
	    x = 0;
	}
	else {
	    double i = (double)this.getA()/(double)this.getB();
	    double j = (double)other.getA()/(double)other.getB();
	    if (i>j) { 
		x=1;
	    }
	    else { 
		x=-1;
	    }
	}
	return x;
    }
}
