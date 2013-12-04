import java.util.*;
import java.io.*;

public class Rational {
    private int numer;
    private int denom;
    private double ratnum;

    public Rational(int n, int d){
	numer = n;
	denom= d;
	ratnum= (1.0 * numer) / (1.0* denom);

    }


    public int gcd(int a, int b){
	if (b==0)
	    return a;
	else 
	    return gcd(b, a%b);

    }
    
    public void reduce(){
	numer=numer/gcd(numer, denom);
	denom= denom/ gcd(numer, denom);

    }

    public int getNum(){
	return numer;}
    public int getDen(){
	return denom;
    }




    public double getValue(){
	return ratnum;

    }

    public boolean equals (Rational other){
	other.reduce();
	this.reduce();
	if (other.getNum()==this.getNum() && other.getDen()==this.getDen())
	    return true;
	else
	    return false;}


    public Rational mult(Rational other){
	int Num2= this.getNum() * other.getNum();
	int Den2= this.getDen() * other.getDen();
	Rational answer= new Rational(Num2, Den2);
	return answer;

    }

    public int compareTo(Rational other){
	other.reduce();
	this.reduce();
	other.getValue();
	this.getValue();
	if (this.equals(other))
	    return 0;
	else if (this.getValue()> other.getValue())
	    return 1;
	else
	    return -1;
    

    }


}
