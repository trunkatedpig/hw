import java.io.*;
import java.util.*;

public class Rational{
    private double number;
    private int a;
    private int b;

    public Rational(int x, int y){
        a = x;
	b = y;
	number = (double)(a) / (double)(b);
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

    public int getA(){
	return a;
    }
    public int getB(){
	return b;
    }
    public double getNumber(){
	return number;
    }
    

    public boolean equals(Rational other){
	return (this.getNumber() == other.getNumber());
    }
    
    public Rational mult(Rational other){
	int tempA = other.getA();
	int tempB = other.getB();
	Rational result = new Rational(tempA * a, tempB * b);
	return result;
    }

    public int compareTo(Rational other){
	if (this.getNumber() == other.getNumber()){
	    return 0;
	} else if (this.getNumber() > other.getNumber()){
	    return 1;
	} else{
	    return -1;
	}
    }
}
