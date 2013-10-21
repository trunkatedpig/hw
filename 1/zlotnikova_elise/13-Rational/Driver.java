public class Driver {
    public static void main(String[] args) {
	Rational a = new Rational(1,2);
	Rational b = new Rational(2,4);
	Rational c = a.mult(b); 

	System.out.println(c.getA());
	System.out.println(c.getB());

	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(b.equals(c));

	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(c));
	System.out.println(c.compareTo(a));
    }    
}
