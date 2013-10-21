public class Rational{
    public int a;
    public int b;
    public double c;

    public Rational(int d, int e){
	a=d;
	b=e;
	c=d/e;
    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);}
    }
    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }

    public boolean equals(Rational other){
	if (c==other.c)
	    return true;
	else {
	    return false;}
    }

    public Rational mult(Rational other){
	int q=a*other.a;
	int w=b*other.b;
	Rational r=new Rational(q,w);
	return r;}

    public int compareTo(Rational other){
	if (this.equals(other))
	    return 0;
	else{
	    if (c>other.c)
		return 1;
	    else{
		return -1;}}}
}

