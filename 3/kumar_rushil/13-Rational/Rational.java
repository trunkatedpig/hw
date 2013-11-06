public class Rational{

    private int a,b;
    private String rational;

    public Rational (int x, int y){
	a = x;
	b = y;
    }

    public void setNumerator(int n){
	a = n;
    }

    public void setDenominator(int d){
	b = d;
    }

    public String getRational(){
	String A,B;
	A = ""+a;
	B = ""+b;
	return (A + "/" + B);
    }

    public int gcd(int a, int b){
	int L,G;
	int R = 0;
	if (a > b){
	    L = b;
	    G = a;
	}else {
	    L = a;
	    G = b;
	}

	if (G%L == 0)
	    return L;

	while (G%L != 0){
	    R = G%L;
	    G = L;
	    L = R;
	    if (L == 0)
		L = L + 1;
	}
	return R;
    }

    public void reduce(){
	int gcd = gcd(a,b);
	a = a / gcd;
	b = b / gcd;
    }

    public double getValue(){
	double d;
	d = (double)a/(double)b;
	return d;
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
  
	if (this.getValue() == other.getValue())
	    return true;
	else {
	    return false;
	}
    }

    public Rational mult(Rational other){
	int a1,b1,x,y;
	x = other.getNumerator();
	y = other.getDenominator();
	a1 = x * a;
	b1 = y * b;
	Rational r3 = new Rational(a1,b1);
	r3.reduce();
	return r3;
    }
    public int compareTo(Rational other){
	double d,d1;
	d = this.getValue();
	d1 = other.getValue();
	if (this.equals(other)){
	    return 0;
	} else {
	    if(d > d1){
		return 1;
	    } else {
		return -1;
	    }
	}
    }

}
