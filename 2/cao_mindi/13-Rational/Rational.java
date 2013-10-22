import java.io.*;
import java.util.*;

public class Rational{
    int a;
    int b;
    int r;
    
    
    public Rational(int x,int y){
	a = x;
	b = y;
    }

    public void setA(int n){
	a = n;
    }
    public void setB(int n){
	b = n;
    }


    public int gcd(int a, int b){
	if (b == 0){
	return a;
	}
	else {
	    return gcd(b, a%b);
	}
    }
    

    public int getA(){
	return a;
    }
    public int getB(){
	return b;
    }


    public void reduce() {
	int x = a;
	int y = b;
	a = a/gcd(a,y);
	b =  b/gcd(x, b);
    }

    public boolean equals(Rational other){
	reduce();
	other.reduce();
	return  (other.getB() == b);
    }
    
    public Rational mult(Rational other){
	Rational Num;
	int x = a * other.getA();
	int y = b * other.getB();
	Num = new Rational(x, y);
	Num.reduce();
	return Num;
    }

    public int compareTo(Rational other){
	int x = b * other.getA();
        int y = a * other.getB();
	return x - y;
    }
}
	
