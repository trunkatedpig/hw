import java.io.*;
import java.util.*;

public class Rational {
    private String number;
    private int a;
    private int b;

    public Rational ( int a , int b ) {
	this.a = a;
	this.b = b;
        reduce();
    }

    public String getNumber() {
	return number;
    }

    public int getNum() {
	return a;
    }

    public int getDen() {
	return b;
    }

    public int gcd ( int a , int b ) {
	if ( b == 0 )
	    return a;
	else {
	    return gcd ( b , a%b );
	}
    }

    public void reduce() {
	int z = gcd ( a , b );
	a = a / z;
	b = b / z;
	number = a + "/" + b;
    }

    public boolean equals ( Rational other ) {
	return this.getNumber().equals (other.getNumber() );
    }

    public Rational mult ( Rational other ) {
	int x = this.getNum() * other.getNum();
	int y = this.getDen() * other.getDen();
	Rational r = new Rational ( x , y );
	r.reduce();
	return r;
    }

    public int compareTo ( Rational other ) {
	double thisValue = ( double ) this.getNum() / this.getDen();
	double otherValue = ( double ) other.getNum() / other.getDen();
	if ( thisValue == otherValue )
	    return 0;
	if ( thisValue > otherValue )
	    return 1;
	else
	    return -1;
    }
}
