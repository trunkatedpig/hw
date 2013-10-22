public class Rational{

    private int a;
    private int b;
    private int n;

public Rational () {
    this.a = a;
    this.b = b;
    }

public Rational (int x, int y) {
    this.a = x;
    this.b = y;
    }

public int gcd(int a,int b) {
    if (b==0)
      return a;
    else {
	return gcd(b,a%b);
    } 
}
public void reduce() {
    int n = gcd(a,b);
    a = (a / n);
    b = (b / n);
}

    public int getA(){
	return a;
    }

    public int getB(){
	return b;
    }

    public boolean equals (Rational other){
	if (other.getA() / other.getB() == this.getA() / this.getB()){
	return (true);
	    }
    else{
	return (false);
	}
    }

public Rational mult(Rational other){
    int top = a * other.getA();
    int bot = b * other.getB();
    Rational ans = new Rational (top, bot);
    return ans;
}

    public int compareTo(Rational other){
	if (this.getA()/this.getB() == other.getA()/other.getB()){
		return (0);
	}
	else if (this.getA() / this.getB() > other.getA() / other.getB()){
		return (1);
	    }
	else{
		return (-1);
	}
    }
}
