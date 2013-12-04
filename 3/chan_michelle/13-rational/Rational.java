public class Rational {
    int a;
    int b;

    public Rational(int a, int b){
	this.a = a;
	this.b = b;
	reduce();
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }
    public void reduce() {
	int x;
	x = gcd(a,b);
	a = a/x;
	b = b/x;
    }

    public int getNumerator(){
	return a;
    }
    public int getDenominator(){
	return b;
    }

    public boolean equals(Rational other){
	this.reduce();
	other.reduce();
	return (this.a == other.a && this.b == other.b);
    }
    //returns True if Rational # represented by other = this

    public Rational mult(Rational other){
	int newA;
	int newB;
	Rational r;
	newA = this.a * other.a;
	newB = this.b * other.b;
	r = new Rational(newA,newB);
	return r;
    }
    //returns new Rational that is result of multiplying other and this

    public String fraction(){
	this.reduce();
	return "" + a + "/" + b;
    }

    public int compareTo(Rational other){
	if (this.a * other.b == other.a * this.b){
	    return 0;
	}
	else if (this.a * other.b > other.a * this.b){
	    return 1;
	}
	else {
	    return -1;
	}
    }
    /*returns 0 if this = other
returns + val if this > other
returns - val if this < other*/

}
