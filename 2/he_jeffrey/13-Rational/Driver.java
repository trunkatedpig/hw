public class Driver {
    public static void main(String[] args) {
	Rational p = new Rational(8,3);
	Rational m = new Rational(16,6);
	System.out.println(p.equals(m));
	Rational z = new Rational(16,5);
	System.out.println(z.equals(m));
        Rational one = new Rational(1,1);
	System.out.println(p.compareTo(p.mult(one)));
	System.out.println(z.compareTo(p));
	Rational r1 = new Rational(4,8);
	Rational r2 = new Rational(2,3);
	System.out.println(r1.mult(r2));
	System.out.println(r1.equals(r1));
	System.out.println(r1.equals(r2));
	System.out.println(r1.compareTo(r1));
	System.out.println(r1.compareTo(r2));
	System.out.println(r2.compareTo(r1));
    }
}
