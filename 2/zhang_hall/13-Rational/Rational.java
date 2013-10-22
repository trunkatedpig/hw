import java.io.*;
import java.util.*;

public class Rational {

    private int a,b;
    private double value;


    public Rational(int top, int bot){
	if (bot != 0){
	    a = top;
	    b = bot;
	    //cast both values to avoid getting an integer value
	    value = (double) a / (double) b;
	}
    }
	

    public int gcd(int a,int b) {
	if (b == 0){
	    return a;
	}
	else {
	    return gcd(b, a % b);
	    }
	
    }
	
    public void reduce(){
	int n = gcd(a,b);
	a = (a / n);
	b = (b / n);
    }
    
    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public double getValue(){
	return value;
    }

    public boolean equals(Rational other){
	return ((double)this.getA() / (double)this.getB() == (double)other.getA() / (double)other.getB());
    }
    
    public Rational mult(Rational other){
	Rational r;
	int a1, b1;
	
	//multiply both A's and both B's 
	a1 = this.a * other.getA();
	b1 = this.b * other.getB();
	//assemble new rational number and reduce
	r = new Rational(a1, b1);
	r.reduce();
	return r;
    }

    public int compareTo(Rational other){
	int z = 0;

	//zero
	if (this.value == other.getValue()){
	    z = 0; 
	}
	//positive
	else if (this.value > other.getValue()){
	    z = 1;
	}

	//negative
	else if (this.value < other.getValue()){
	    z = -1;
	}
	    return z;
	
    }
}
