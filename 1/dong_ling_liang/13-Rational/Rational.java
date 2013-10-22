public class Rational{
    private int a, b; 
    
    public Rational(int x){
	a = x;
	b = 1;
    }
    public Rational(int x, int y){
	a = x;
	b = y;
    }
    public int gcd(int a, int b){
	if (b==0)
	    return a;
	else 
	    return gcd(b, a%b);
    }
    public void reduce(){
	a = a / gcd(a, b);
	b = b / gcd(a, b);
    }
    public int getp(){
	return a;
    }
    public int getq(){
	return b;
    }
    public boolean equals(Rational other){
	int q, w, e, r;
	this.reduce();
	other.reduce();
	q = this.a;
	w = this.b;
	e = other.getp();
	r = other.getq();
	if (q==e && w==r){
	    return true;
	    }
	else {
	    return false;
	}
    }
    public Rational mult(Rational other){
	int x, y;
	x = this.a * other.getp();
	y = this.b * other.getq();
	Rational ret = new Rational(x, y);
	return ret;
    }
    public int compareTo(Rational other){
	double x, y;
	x = (float)this.a/this.b;
	y = (float)other.getp()/other.getq();
	if (x>y){
	    return 1;
	}
	else if (x==y){
	    return 0;
	}
	else {
	    return -1;
	}
    }
}
	 


