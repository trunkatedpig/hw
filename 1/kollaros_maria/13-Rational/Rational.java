import java.io.*;
import java.util.*;

public class Rational{
    private int a;
    private int b;

    public Rational(){
	a = 1;
	b = 2;
    }

    public Rational(int r,int s){
	a = r;
	b = s;
    }

    public void setNum(int t){
	a = t;
    }

    public void setDenom(int y){
	b = y;
    }

    public int gcd(int a,int b){
	if (b == 0)
	    return a;
	else{
	    return gcd(b, a % b);
	}
    }

    public void reduce(){
	int n = gcd(a,b);
	a = a / n;
	b = b / n;
    }


    public String getRational(){
	if (a == 0){
	    return "" + 0;
	}
	else{
	    reduce();
	    return "" + a + "/" + b;
	}
    }

    public double getNum(){
	reduce();
	return (double)a;
    }
    
    public double getDenom(){
	reduce();
	return (double)b;
    }



    public boolean equals(Rational other){
	return (this.getNum() / this.getDenom()) == (other.getNum() / other.getDenom());
    }

    public Rational mult(Rational other){
	int g = ((int)(this.getNum())) * ((int)(other.getNum()));
	int h = ((int)(this.getDenom())) * ((int)(other.getDenom()));
	Rational alice = new Rational(g,h);
	return alice;
    }
	
		       		       
    public int compareTo(Rational other){
	if ( (this.getNum() / this.getDenom()) == (other.getNum() / other.getDenom())){
	    return 0;
	}
	else if ((this.getNum() / this.getDenom()) > (other.getNum() / other.getDenom())){
	    return 1;
	}
	else{
	    return -1;
	}
    }
	
}
