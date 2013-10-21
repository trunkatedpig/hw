import java.io.*;
import java.util.*;

public class Rational {

    //Method to make rational numbers (a/b)
    public double getRational(int a, int b) {
	return (double) /*does this need to be here?*/ a/b;
    }

    //Constructor to create rational inputs
    public Rational (int a, int b){
	makeRational(a,b);
    }

    //Methods to return parts of fraction
    public int getA(){ //no input
	return a;
    }
    public int getB(){ //no input
	return b;
    }


    ///////////////////////////////////////////

    public int gcd(int a,int b) {
	if (b=0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    } 
	
    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
    
    ///////////////////////////////////////////

    public boolean equals (Rational other) { //true if other is same as this
	if (a == other.getA() && b == other.getB()) {
	    return true;
	}
	else {return false;}
    }

    public Rational mult(Rational other) {
	rational ans = new Rational (
				     (a * other.getA)
				     /
				     (b * other.getB));
	return ans;
    }


    //Answer to compareTo with help from David Bang's code. Thanks!
    public int compareTo (Rational other){
	int ans;
	ans = -1;
	if (equals(other)) ans=0;
	if (getRational() > other.getRational()) ans=1;
	return ans;
    }
    

}