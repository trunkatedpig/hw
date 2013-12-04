import java.io.*;
import java.util.*;

public class Rational{
    private int a, b;

    public Rational(int x, int y){
	a = x;
	b = y;
    }

    public int gcd(int a, int b){
	if (b==0){
	    return a;
	}
	else {
	    return gcd(b, a%b);
	}
    }

    public void reduce(){
	int n = gcd(a,b);
	a = a/n;
	b= b/n;
    }

    public int geta(){
	return a;
    }
    
    public int getb(){
	return b;
    }

    public boolean equals(Rational other){
	this.reduce();
	other.reduce();
	if (this.a == other.geta() && this.b == other.getb()){
	    return true;
	}
	else {
	    return false;
	}
    }
	
    public Rational mult(Rational other){
	this.reduce();
	other.reduce();
	int avalue = this.a * other.geta();
	int bvalue = this.b * other.getb();
	Rational ret = new Rational(avalue,bvalue);
        return ret;
    }
    
    public int compareTo(Rational other){
	double first = (double) this.a/this.b;
	double second = (double) other.geta()/other.getb();
	if (first == second){
	    return 0;
	}
	else if (first > second){
	    return 1;
	}
	else {
	    return -1;
	}
    }
}

	    
	
