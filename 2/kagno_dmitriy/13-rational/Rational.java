public class Rational {
    private int a,b;
    
    public Rational(int i,int j){
	a = i;
	b = j;
	reduce();
    }
    
    public int gcd(int a,int b){
	if (b == 0)
	    return a;
	else{
	    return gcd(b,a%b);
	}
    }
    
    public void reduce(){
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
    
    public boolean equals(Rational other){
	if ((a/b) == (other.a / other.b))
	    return true;
	else {
	    return false;
	}
    }
    
    public Rational mult(Rational other){
	int i = a * other.a;
	int j = b * other.b;
	Rational number = new Rational(i,j); 
	return number;
    }
    
    public int compareTo(Rational other){
        if ((a/b) == (other.a / other.b))
	    return 0;
	else{ if ((a/b)> (other.a / other.b))
		return 1;
	    else 
		return -1;
	}
    }
}
