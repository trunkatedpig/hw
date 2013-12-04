import java.io.*;
import java.util.*;

public class Rational {
    private int a;
    private int b;
    private String f = "" + a + "/" + b;
    private double v = a/b;

    public Rational(int m, int n){
	a = m;
	b = n;
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

    public boolean equals(Rational other){
	return this.f.equals(other.f);
    }
    
    public Rational mult(Rational other){
	return new Rational((other.a)*(this.a), (other.b)*(this.b));
    }

    public double compareTo(Rational other){
	return this.v-other.v;
    }    
}
