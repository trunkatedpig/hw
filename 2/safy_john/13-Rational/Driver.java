public class Driver {
     public static void main (String [] args) {
	 Rational r1, r2;
	 r1 = new Rational (4, 3);
	 r2 = new Rational (1, 2);
	 System.out.println(r1.equals(r2));
	 System.out.println(r1.mult(r2));
	 System.out.println(r1.compareTo(r2));
     }
}
			 
