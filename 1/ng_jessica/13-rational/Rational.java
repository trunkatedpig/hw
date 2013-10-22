import java.io.*; 
import java.utl.*; 

public class Rational {
    private int a; 
    private int b; 
 
    public void set (int x, int y) {
	a = x;
	b = y; 
    }
    
    public int callA() {
	return a; 
    }

    public int callB() {
	return b; 
    }

    public int callR() {
	return a/b; 
    }

    public int gcd(a,b) {
	if (b=0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }
        
    public void reduce() {
	a = a / gcd(a.callA(),a.callB());
	b = b / gcd(b.callA(),b.callB());
    }

    public boolean equals(Rational other) {
	this.reduce();
	other.reduce();
	boolean j = this.a == other.getA(); 
	boolean k = this.b == other.getB();
	return k && j;
    }

    public Rational mult(Rational other) {
	int c = other.calltA();
	int d = other.callB();
	int e = this.callA();
	int f = this.callB();
	Rational r = new Rational();
	r.setRational( c * d , e * f );
	return r;
    }

    public int compareTo(Rational other) {
	if (this.callR() > other.callR()) {
	    return 1;
	}
	else if (this.callR() == other.callR()) {
	    return 0;
	}
	else {
	    return -1;
	}
    }
}
