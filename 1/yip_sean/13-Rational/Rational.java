public class Rational {
	//the return type of the reduce() method has been changed to Rational, rather than void
	private int a = 0, b = 1;
	
	public Rational() {}
	
	public Rational(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {return a;}
	public int getB() {return b;}
	
	public int gcd(int a, int b) {
		if (b > a) {//swaps a and b in case b is greater than a
			int x = a;
			a = b;
			b = x;
		}
		
		if (b == 0) {return a;}
		else {return gcd(b, a % b);}
	}
	
	//the return type of the reduce() method has been changed to Rational, rather than void
	public Rational reduce() {return new Rational(a / gcd(a, b), b / gcd(a, b));}
	
	public boolean equals(Rational other) {return a * other.getB() == b * other.getA();}
	
	public Rational mult(Rational other) {return new Rational(a * other.getA(), b * other.getB()).reduce();}
	
	public int compareTo(Rational other) {
		if (equals(other)) {return 0;}
		else if (a * other.getB() > b * other.getA()) {return 1;}
		else {return -1;}
	}
	
	public String toString() {return "" + a + "/" + b;}
}