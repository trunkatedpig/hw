public class Rational {
    private int a;
    private int b;
    
    public int getNum() {return a;}
    public int getDen() {return b;}
    public double getValue() {return (double) a/b;}
    
    public void setNum(int n) {a=n;}
    public void setDen(int d) {
	if (d==0) {System.out.println("You kidding?");}
	else {b=d;}
    }

    public Rational() {
	a=1;
	b=1;
    }
    public Rational(int n, int d) {
	a=n;
	if (d==0) {System.out.println("You kidding?");}
	else {b=d;}
    }

    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	} 
    }
    public void reduce() {
	int olda=a;
	a = a / gcd(a,b);
	b = b / gcd(olda,b);
    }

    public boolean equals(Rational other) {
	Rational r1 = new Rational(a,b);
	Rational r2 = new Rational(other.a,other.b);
	r1.reduce();
	r2.reduce();
	return (r1.a==r2.a) && (r1.b==r2.b);
    }
    public Rational mult(Rational other) {
	return new Rational(a*other.a,b*other.b);
    }
    public int compareTo(Rational other) {
	double n = getValue()-other.getValue();
	if (n==0) {return 0;}
	else if (n<0) {return -1;}
	else {return 1;}
    }
    public void print() {
	System.out.println("Rational: "+getNum()+"/"+getDen()+" = "+getValue());
    }
}
