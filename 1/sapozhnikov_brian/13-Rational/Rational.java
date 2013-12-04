import java.io.*;
import java.util.*;

public class Rational{
    private int a;
    private int b;

    public void init(int x, int y){
	a = x;
	b = y;
    }

    public Rational(int x, int y){
	init(x,y);
    }

    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public void setA(int x){
	a = x;
    }

    public void setB(int y){
	b = y;
    }

    public void setAB(int x, int y){
	init(x,y);
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
	reduce();
	other.reduce();
	return a==other.getA() && b==other.getB();
    }

    public Rational mult(Rational other){
	int x = a * other.getA();
	int y = b * other.getB();
	Rational ans = new Rational(x,y);
	return ans;
    }

    public int compareTo(Rational other){
	int ans = -1;
	if (equals(other))
	    ans = 0;
	if (a/b > other.getA()/other.getA())
	    ans = 1;
	return ans;
    }
}
