public class Rational{
	private int top;
	private int bottom;
	public mkrational(int t, int b,){
		top=t;
		bottom=b;
	}
	public int gcd(a,b) {
		if (b=0)
	 		return a;
		else {
	 		return gcd(b,a%b);
	} 

	public void reduce() {
		a = a / gcd(a,b);
		b - b / gcd(a,b);
	}
	public boolean equals(Rational other){
		reduce();
		other.reduce();
		if (this.top==other.top){
			return (this.bottom==other.bottom);
		}
		else {
			return flase;
		}
	}
	public Rational mult(Rational other){
		Rational ans;
		ans.top=top*other.top;
		ans.bottom=this.bottom*other.bottom;
		return ans;
	}
	public int compareTo(Rational other){
		int rt;
		int ot;
		int rb;
		int ob;
		rt=double(this.top);
		rb=double(this.bottom);
		ot=double(other.top);
		ob=double(other.bottom);
		if (rt/rb < ot/ob){
			return 1;
		}
		if (rt/rb = ot/ob){
			return 0;
		}
		if (rt/rb > ot/ob){
			return -1;
		}
		return 0; //so java doesn't get confused
	}
}
