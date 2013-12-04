import java.io.*;
import java.util.*;

public class Rational{

private int a,b;
private double rat;

	public Rational (int x, int y){
		a=x;
		b=y;
		rat=a/b;
	}
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public double getRat(){
		return rat;
	}
	
	//given
	public int gcd (int a, int b){
		if (b==0)
			return a;
		else{
			return gcd(b,a%b);
		}
	}
	public void reduce (){
		a = a / gcd(a,b);
		b = b / gcd(a,b);
	}
	
//first method	
	public boolean equals (Rational other){
		return this.getRat()==other.getRat();
	}
	
//second method
	public String toString(){
		return "" + a + "/" + b;
	}
	
	public Rational mult(Rational other){
		int a=this.getA()*other.getA();
		int b=this.getB()*other.getB();
		Rational multiply=new Rational (a,b);
		return multiply;
	}

//third method
	public int compareTo(Rational other){
		if (this.getRat() > other.getRat())
			return 1;
		else if (this.getRat()==other.getRat())
			return 0;
		else
			return -1;
	}	
}