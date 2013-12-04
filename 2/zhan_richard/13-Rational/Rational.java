public class Rational{
    private int a, b;
    public Rational(int i, int j){
	a = i;
	b = j;
    }
    public int gcd(int a,int b){
	if (b==0)
	    return a;
	else
	    return gcd(b,a%b);
    }
    public void reduce(){
	a=a/gcd(a,b);
	b=b/gcd(a,b);
    }
    public boolean equals(Rational other){
	reduce();
	other.reduce();
	return this.a==other.a && this.b==other.b;
    }
    public Rational mult(Rational other){
	Rational r =new Rational(this.a*other.a,this.b*other.b);
	return r;
    }
    public int compareTo(Rational other){
	reduce();
	other.reduce();
	double i = (double)(this.a);
	double j = (double)(this.b);
	double k = (double)(other.a);
	double l = (double)(other.b);
	if (i/j > k/l)
	    return 1;
	else if (i/j < k/l)
	    return -1;
	else
	    return 0;
    }
    public String getRations(){
	String result = "" + a + " " + b;
	return result;
    }
}
