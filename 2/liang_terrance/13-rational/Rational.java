import java.io.*;
import java.util.*;

public class Rational{
    private int a,b,g;
    private double number;

    public int gcd(int a,int b) {
	if (b==0){
	    return a;
	}
	else {
	    return gcd(b,a%b);
	} 
    }
    public void reduce() {
	g = gcd (a,b);
	a = a / g;
	b = b / g;
    }

    public Rational (int x, int y){
	a = x;
	b = y;
	this.reduce();
	if (b!=0){
	    number = (double)(a) / (double)(b);
	}
    }

    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public double getNumber(){
	return number;
    }

    public boolean equals (Rational other){
	return (a == other.getA())&&(b == other.getB());
    }

    public Rational mult (Rational other){
	Rational r;
	r = new Rational (a*other.getA(),b*other.getB());
	return r;
    }

    public int compareTo(Rational other){
	int answer;
	if (number >= other.getNumber()){
	    if (number == other.getNumber()){
		answer = 0;
	    }
	    else {
		answer = 1;
		    }
	}
	else {
	    answer = -1;
		}
	return answer;
    }

}    


