public class Rational {
    private int a;
    private int b;

    public Rational(int x,int y) {
	a = x;
	b = y;
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	int olda = a;
	a = a / gcd(a,b);
	b = b / gcd(olda,b);
    }

    public boolean equals(Rational other) {
	reduce();
	other.reduce();
	return (a == other.getA() && b == other.getB());
    }

    public Rational mult(Rational other) {
	reduce();
	other.reduce();
	int newA = a * other.getA();
	int newB = b * other.getB();
	return new Rational(newA,newB);
    }

    public int compareTo(Rational other) {
	reduce();
	other.reduce();
	if (a / b > other.getA() / other.getB())
	    return 1;
	else if (a / b < other.getA() / other.getB())
	    return -1;
	else
	    return 0;
    }



    public int getA() {
	return a;
    }

    public int getB() {
	return b;
    }
}