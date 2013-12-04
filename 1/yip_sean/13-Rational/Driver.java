public class Driver {
	public static void main(String[] args) {
		Rational p = new Rational(3, 4), q = new Rational(7, 8), r = new Rational(5, 8), s = new Rational(6, 8);
		
		System.out.println(p.equals(q));
		System.out.println(p.equals(r));
		System.out.println(p.equals(s) + "\n");
		
		System.out.println(p.mult(q));
		System.out.println(p.mult(r));
		System.out.println(p.mult(s) + "\n");
		
		System.out.println(p.compareTo(q));
		System.out.println(p.compareTo(r));
		System.out.println(p.compareTo(s));
	}
}