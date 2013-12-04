import java.io.*;
import java.util.*;

public class Rational{
    private int a, b;
    private double r;


    public Rational(int num,int den){
	if (den != 0){
	    a = num;
	    b = den;
	    r = (double)num /(double)den;
    }
    }


    public int gcd(int a, int b){
	if (b==0){
	    return a;
	}
	else{
	    return gcd(b, a%b);
	}
    }

    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public double getR(){
	return r;
    }

    public boolean equals(Rational other){
	return (this.r == other.getR()); 
		}

    public Rational mult(Rational other){
	int num, den;
	Rational rat;
	num = this.a * other.getA();
	den = this.b * other.getB();
	rat = new Rational(num,den);
	rat.reduce();
	return rat;
    }

    public int compareTo(Rational other){
	if (this.r == other.getR()){
	    return 0;
	}
	else if(this.r> other.getR()){
	    return 1;
	}
	else if (this.r < other.getR()){
	    return -1;
	}
	return 0;
    }

}

