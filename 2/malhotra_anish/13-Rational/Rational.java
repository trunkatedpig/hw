import java.io.*;
import java.util.*;

public class Rational {

private int a;
private int b;
//private double result;

public Rational(int a, int b) {
	this.a = a;
	this.b = b;
	reduce();
}

public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
}
    

public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
}


public boolean equals(Rational other) {
	
	 return (other.a == this.a && other.b == this.b);
}


 public Rational mult(Rational other){
        int c = this.a * other.a;
        int d = this.b * other.b;
        Rational newresult = new Rational(c,d);
        return newresult;
}

 //public int compareTo(Rational other){
     //can't get this to work
		
}





