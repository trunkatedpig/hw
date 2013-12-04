
public class Rational {
    private int a,b;

    public void setAB (int x, int y){
	a = x;
	b = y;
    }
    
    public double getAB () {
	return (double) a / b;
    }
    public int getA (){
	return a;
    }
    public int getB () {
	return b;
    }

    public Rational (int x, int y) {
	setAB (x,y);
    }
    
    public int gcd(int p ,  int q) {
	if (q == 0)
	    return p;
	else {
	    return gcd(q,p%q);
	} 
    }

    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
	
    public boolean equals (Rational other) {
        
        return a/b == other.getAB();
    }

    public Rational mult (Rational other) {
        Rational x = new Rational( a * other.getA(), b * other.getB());
        return x;
    }

    public int compareTo (Rational other) {
	int x = -1;
        if (equals(other))
            x = 0;
        if (getAB () >other.getAB())
            x = 1;
        return x;
    }
}


