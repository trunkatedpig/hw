public class Driver {
    public static void main(String[] args) {
	Rational r = new Rational(4,8);
	Rational r1 = new Rational(10,16);
	
	System.out.println(r.mult(r1));

	System.out.println(r.compare(r1));
    }
}
