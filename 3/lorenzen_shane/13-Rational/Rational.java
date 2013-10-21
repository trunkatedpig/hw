public class Rational {
    int a,b,value;
    public Rational(int a1, int b1){
	a=a1;
	b=b1;
	value = a/b;
    }

    public int getNumerator(){
	return a;
    }
    public int getDenominator(){
	return b;
    }
    public int getRational(){
	return value;
    }
    public int gcd(int a,int b) {
	if (b==0){
	    return a;
    }
	else {
	    return gcd(b,a%b);
	}
    } 

	public void reduce() {
	    int n = gcd(a,b);
	    a = a / n;
	    b = b / n;
	}
    public boolean equals(Rational other){
	if (other.getRational() == value){
	    return true;
	}else{
	    return false;
	}
    }
    public Rational mult(Rational other){
	Rational r = new Rational(a*other.getNumerator(),b*other.getDenominator());
	return r;
    }
    public int compareTo(Rational other){
	if (other.getRational() > value){
	    return 1;
	} else if (other.getRational() < value) {
	    return -1;
	} else {
	    return 0;}
    }
}
