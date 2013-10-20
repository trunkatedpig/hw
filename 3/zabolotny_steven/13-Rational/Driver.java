public class Driver {
    public static void main(String[] args) {
	Rational r1 = new Rational(4,3);
	Rational r2 = new Rational(1,2);
	Rational r3 = new Rational(2,4);
	System.out.println("Equals: " + r2.equals(r3) + " should be true.");
	System.out.println("Equals: " + r2.equals(r1) + " should be false.");
	System.out.println("Mult: " + r1.mult(r2) + " should be a memory address.");
	System.out.println("Mult (a): " + (r1.mult(r2)).getA() + " should be 4.");
	System.out.println("Mult (b): " + (r1.mult(r2)).getB() + " should be 6.");
	System.out.println("CompareTo: " + r1.compareTo(r2) + " should be 1.");
	System.out.println("CompareTo: " + r2.compareTo(r1) + " should be -1.");
	System.out.println("CompareTo: " + r2.compareTo(r3) + " should be 0.");
    }
}