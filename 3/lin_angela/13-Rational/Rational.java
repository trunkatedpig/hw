public class Rational {

    private int a;
    private int b;
    private double rat;

    public Rational(int num, int deno){
	a = num;
	b = deno;
	rat =(double) a/(double) b;

    }

    public int gcd(int a, int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
		}
    }


    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }


    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public double getRat(){
	return rat;
    }

    public boolean equals(Rational others){
	others.reduce();
	reduce();
	if (this.a==others.getA() && this.b == others.getB()){
	    return true;
	}else
	    return false;
    }

    public Rational mult(Rational other){
	int newA;
	int newB;
	Rational r;
	newA = other.getA() * this.a;
	newB = other.getB() * this.b;
	r = new Rational(newA, newB);
	return r;
    }

       
    public int compareTo(Rational other){
	int ans=0;
	if (this.rat > other.getRat())
	    ans =  1;
	else if (this.rat == other.getRat())
	    ans =  0;
	else if (this.rat < other.getRat())
	    ans = -1;
	return ans;
    }








}
