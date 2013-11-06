public class Rational{
    private int denom;
    private int numer;

    public Rational(int x, int y){
	denom = x;
	numer = y;
	reduce(x,y);
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    }

    public void reduce(int a, int b) {
       a = a / gcd(a,b);
       b = b / gcd(a,b);
   }

    public boolean equals(Rational other) {
	if (denom/numer == other.denom/other.numer) {
	    return true;
	} else {
	    return false;
	}
    }

    public Rational mult(Rational other) {
	int x, y;
	x = denom * other.denom;
	y = numer * other.numer;
	Rational result = new Rational(x,y);
	return result;
    }
    
    public int compareTo(Rational other) {
	double qh, qo;
	qh =  numer / denom;
	qo = other.numer / other.denom;
	if (qh == qo) 
	    return 0;
	else if(qh > qo) 
	    return 1;
	else 
	    return -1;
    }

}
