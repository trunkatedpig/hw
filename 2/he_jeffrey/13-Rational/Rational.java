public class Rational {
    private int a, b;
    public Rational(int a, int b) {
	this.a = a;
	this.b = b;
	this.reduce();
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else 
	    return gcd(b,a%b);
    } 

    public void reduce() {
		int n = gcd(a,b);
		a = a / n;
		b = b / n;

    }

    public boolean equals(Rational other) {
	if (a == other.a && b == other.b) {
	    return true;
	} else {
	    return false;
	}
    }

    public Rational mult(Rational other) {
	int x, y;
	x = a * other.a;
	y = b * other.b;
	Rational result = new Rational(x,y);
	return result;
    }
    
    public int compareTo(Rational other) {
	double quotientMe, quotientOther;
	quotientMe = a / b;
	quotientOther = other.a / other.b;
	System.out.println(quotientMe);
	System.out.println(quotientOther);
	if (quotientMe == quotientOther) {
	    return 0;
	}
	else if(quotientMe > quotientOther) {
	    return 1;
		}
	else {
	    return -1;
	}
    }
}
