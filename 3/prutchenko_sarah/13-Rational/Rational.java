public class Rational{
    private int a, b
    private double rational;
    public Rational(int num, int den){
	a= num;
	b= den;
	rational = num/den;
    }
    public boolean equals( Rational other){
	if (rational == other.rational);
    }
    public Rational mult(Rational other){
    }
    public int CompareTo(Rational other){
    }
    public int getNum(Rational r){
	return a;
    }
    public int getDen(Rational r){
	return b;
    }
}
