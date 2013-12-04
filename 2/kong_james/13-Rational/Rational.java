import java.io.*;
import java.util.*;

public class Rational {

    private int a,b,res;
    private double c, NewR;
    public Rational(int i,int j){
	a = i;
	b = j;
	c = (double)(i)/ j;
    }
 
    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);}
    }
	   
    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
    public boolean equals(Rational other){
	return (this.c == other.c);
    }

    public Rational mult(Rational other){
	Rational NewR;
	NewR = new Rational (this.a * other.a, this.b*other.b);
	return NewR;
	
    }
    public int compareTo(Rational other){
	if (this.c == other.c)
	    {res = 0;}
	if (this.c > other.c)
	    {res = 1;}
	if (this.c < other.c)
	    {res = -1;}
	return res;
    }

    public double getC(){
	return c;
    }
}






