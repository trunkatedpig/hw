
public class Rational{
     int n,d;
     
     public Rational(int a, int b){
	 n=a;
	 d=b;
     }

     public void setN(int a){
	 n=a;
     }
     public void setD(int b){
	 d=b;
     }
    public int getN(){
	return n;
    }
    public int getD(){
	return d;
    }

     public int gcd(int a,int b) {
	 if (b==0)
	     return a;
	 else {
	     return gcd(b,a%b);
	 } 
     }
     public void reduce() {
	 n = n / gcd(n,d);
	 d = d / gcd(n,d);
     }

     public boolean equals(Rational other){
	 this.reduce();
	 other.reduce();
	 if (this.n==other.n&&this.d==other.d)
	     return true;
	 else
	     return false;
     }
     public Rational mult(Rational other){
	 this.reduce();
	 other.reduce();
	 int newN = this.n*other.n;
	 int newD = this.d*other.d;
	 Rational multi= new Rational(newN,newD);
	 multi.reduce();
	 return multi;
     }
    public int compareTo(Rational other){
	if ((this.n-other.n)<0&&(this.d-other.d)<0)
	    return (0-1)*((this.n-other.n)/(this.d-other.d));
	else if (this.n==other.n&&this.d==other.d)
	    return 0;
	return (this.n-other.n)/(this.d-other.d);
    }
}
 
