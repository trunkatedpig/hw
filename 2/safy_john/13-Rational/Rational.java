public class Rational {
    private int a;
    private int b;
    private double quotient;
    
    public Rational (int a1, int b1) {
	a = a1;
	b = b1;
	quotient = a / b;
    }
    
    public int gcd (int a, int b) {
	if (b == 0)
	    return a;
	else {
	    return gcd(b, a % b);
	}
    }
   
    public void reduce() {
	a = a / gcd (a, b);
	b = b / gcd (a, b);
    }
    
    public boolean equals (Rational other) {
	return (this.quotient == other.quotient);
    }
    
     public Rational mult (Rational other) {
	Rational r = new Rational (this.a * other.a , this.b * other.b);
	r.reduce();
	return r;
    }
  
    public int compareTo (Rational other) {
	if (this.quotient == other.quotient) {
	    return 1; 
	}
	else {
	    if (this.quotient > other.quotient) {
		return 1;
	    }
	    else {
		return -1;
	    }
	}
    }
}

