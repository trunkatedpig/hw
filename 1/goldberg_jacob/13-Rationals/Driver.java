public class Driver{
    public static void main(String[] args){
	Rational r = new Rational(5,6);
	Rational q = new Rational(10,12);
	Rational t = new Rational(11,3);
	Rational e = new Rational(2,90);
	q.reduce(10,12);
	System.out.println(r.mult(t));
	System.out.println(r.equals(t));
	System.out.println(r.equals(q));
	System.out.println(r.compareTo(q));
	System.out.println(r.compareTo(e));
        System.out.println(r.compareTo(t));
    }}
