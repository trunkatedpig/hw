public class Driver {
    public static void main(String[] args) {
	Rational r1, r2, r3;
	r1 = new Rational(3,4);
	r2 = new Rational(2,5);
	r3 = r1.mult(r2);
	System.out.println(r1.equals(r2));
	System.out.println(r3.getRational());
	System.out.println(r1.compareTo(r2));
	Rational r4,r5,r6;
	r4 = new Rational();
	r5 = new Rational(1,2);
	r6 = r4.mult(r5);
	System.out.println(r4.equals(r5));
	System.out.println(r6.getRational());
	System.out.println(r4.compareTo(r5));
    }
}