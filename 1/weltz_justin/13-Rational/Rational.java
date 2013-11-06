public class Rational{
    private int a;
    private int b;
    private double number;
    public int gcd(int a,int b) {
	if (b==0)
	    return a;
	else {
	    return gcd(b,a%b);
	}
    }

    public void reduce() {
	a = a / gcd(a,b);
	b = b / gcd(a,b);
    }
    public Rational(int x, int y){
	seta(x);
	setb(y);
	number = (double)a / (double)b;
    }
    public void seta(int m){
	a = m;
    }
    public void setb(int n){
	b = n;
    }
	
    public boolean equals(Rational other){
	return number == other.number;
    }
    public int geta(){
	return a;
    }
    public int getb(){
	return b;
    }
    //changed output in order to see if it multiplied correctly
    public String mult(Rational other){
	int m = a * other.a;
	int n = b * other.b;
	Rational x = new Rational(m,n);
	return x +" \n" + x.geta() + " " + x.getb() ;
    }
      public Rational mult1(Rational other){
	int m = a * other.a;
	int n = b * other.b;
	Rational x = new Rational(m,n);
	return x ;
    }
    public int compareTo(Rational other){
	if ( number == other.number)
	    return 0;
	if (number > other.number)
	    return 1;
	else
	    return -1;
    }
}
	
    
    
