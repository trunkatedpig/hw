public class Driver {
    public static void main(String[] args) {
	Rational r1 = new Rational(3,10);
	Rational r2 = new Rational(5,9);
	Rational r3 = r1.mult(r2);
	Rational r4 = new Rational(r3.getNum(),r3.getDen());
	r4.reduce();

	System.out.println();
	System.out.println("MyonMyonMyon!");
	System.out.println();
	r1.print();
	r2.print();
	r3.print();
	r4.print();
	System.out.println("r1==r2?  "+r1.equals(r2));
	System.out.println("r3==r4?  "+r3.equals(r4));
	System.out.println("r1.compareTo(r2)?  "+r1.compareTo(r2));
	System.out.println("r2.compareTo(r1)?  "+r2.compareTo(r1));
	System.out.println("r3.compareTo(r4)?  "+r3.compareTo(r4));
	System.out.println();
    }
}
