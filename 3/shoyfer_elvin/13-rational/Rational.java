public class Rational {
	private int a;
	private int b = 1; // default denominator is 1

	public Rational() {
		setAB(0,1);
	}

	public Rational(int a, int b){
		setAB(a,b);
	}

	public void setAB(int a, int b) {
		this.a = a;
		if (b != 0) {
			this.b = b;
		}
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	public int gcd(int a,int b) {
		if (b==0) {
		    return a;
		} else {
		    return gcd(b, a%b);
		} 
    }
    
    public void reduce() {
		int gcd = gcd(a,b);
		a = a / gcd;
		b = b / gcd;
    }


	public boolean equals(Rational other) {
		this.reduce();
		other.reduce();
		return ((this.a == other.a) && (this.b == other.b));
	}

	public Rational mult(Rational other) {
		int newA = this.a * other.a;
		int newB = this.b * other.b;
		Rational output = new Rational(newA, newB);
		return output;
	}

	public int compareTo(Rational other) {
		double quotientT = this.a / this.b;
		double quotientO = other.a / other.b;
		double difference = quotientT - quotientO;
		if (difference > 0) {
			return 1;
		} else if (difference < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}