public class Driver{

    public static void main (String [] args){

	Rational r = new Rational(15,6);
	Rational r2 = new Rational(30,12);
	Rational r3 = r.mult(r2);
	r2.reduce();
	r.reduce();
	System.out.println(r.getRational());
	System.out.println(r2.getRational());
	System.out.println(r.getValue());
	System.out.println(r2.getValue());
	System.out.println(r.equals(r2));
	System.out.println(r3.getRational());
	System.out.println(r.compareTo(r2));
	System.out.println(r.compareTo(r3));
    }
}
