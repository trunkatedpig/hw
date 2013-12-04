public class Driver {
    public static void main(String[] args) {
	Rational r = new Rational(5, 10);
	Rational r2 = new Rational(1, 2);
	Rational r3 = new Rational(4, 155);
	Rational r4 = new Rational(5, 0);

	System.out.println(r.getA());
	System.out.println(r.getB());

	System.out.println(r4.getValue());
	System.out.println(r3.getValue());
	System.out.println(r2.getValue());
	System.out.println(r.getValue());
	
	System.out.println(r.equals(r2));
	System.out.println(r2.equals(r));
	System.out.println(r.equals(r3));
	System.out.println(r3.equals(r4));
	
	System.out.println(r.mult(r2).getA());
	System.out.println(r.mult(r2).getB());
	System.out.println(r.mult(r4).getA());
	System.out.println(r.mult(r4).getB());
	System.out.println(r2.mult(r3).getA());
	System.out.println(r2.mult(r3).getB());
	System.out.println(r2.mult(r4).getA());
	System.out.println(r2.mult(r4).getB());
	
	System.out.println(r.compareTo(r2));
	System.out.println(r.compareTo(r3));
	System.out.println(r3.compareTo(r));
	System.out.println(r4.compareTo(r3));
    }
}
