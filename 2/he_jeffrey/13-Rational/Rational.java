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
	a = a / gcd(a,b);
	b = b / gcd(a,b);
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
	if (quotientMe == quotientOther) 
	    return 0;
	else if(quotientMe > quotientOther) 
	    return 1;
	else 
	    return -1;
	
    }
}
