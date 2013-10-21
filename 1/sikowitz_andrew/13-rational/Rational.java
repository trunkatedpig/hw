public class Rational {
    private int a;
    private int b;

    public Rational(int a, int b) {
	this.a = a;
	if (b != 0)
	    this.b = b;
	else {
	    System.out.println("Your second integer cannot be 0. It is now 1");
	    this.b = 1;
	}
	reduce();
    }

    public int getA() {
	return a;
    }

    public int getB() {
	return b;
    }

    public int gcd(int a, int b) {
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

    public boolean equals(Rational other) {
	return this.a == other.getA() && this.b == other.getB();
    }

    public Rational mult(Rational other) {
	Rational r = new Rational(this.a * other.getA(), this.b * other.getB());
	return r;
    }

    public double getValue() {
	double dA = 1.0 * a;
	double dB = 1.0 * b;
	return dA/dB;
    }

    public int compareTo(Rational other) {
	if (this.getValue() > other.getValue())
	    return 1;
	else if (this.equals(other))
	    return 0;
	else
	    return -1;
    }
}
