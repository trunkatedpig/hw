import java.io.*;
import java.util.*;

public class Rational {
    private int a,b;
    private double rat;

    public Rational (int numerator, int denominator){
	a = numerator;
	b = denominator;
	rat = a/b;
    }

    public int gcd(int a,int b){
	if (b == 0){
	    return a;
	} else 
	    {
		return gcd(b, a%b);
	    }
    }

    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public boolean equals (Rational other){
	if (this.rat == other.rat ){
	    return true;
	}
	else {return false;} 
    }

    public Rational mult (Rational other){
    	Rational answer = new Rational(this.a * other.a , this.b * other.b); 
    	answer.reduce();
    	return answer;
    }
    //keeps returning with location and not new rational number

    public int compareTo (Rational other){
	if (this.rat == other.rat){
	    return 0;
	}else if (this.rat > other.rat){
	    return 1;}
	else {
	    return -1;} 
    }
}
