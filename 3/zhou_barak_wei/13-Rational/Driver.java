public class Driver {
	public static void main(String[] args) {
		Rational test1 = new Rational(0, 0);
		Rational test2 = new Rational(0, 0);
		
		test1.seta(1);
		test1.setb(2); // 1/2
		
		test2.seta(1);
		test2.setb(3); // 1/3
		
		System.out.println(test1.equals(test2)); // false
		System.out.println(test1.mult(test2)); // 1/6
		System.out.println(test1.compareTo(test2)); // positive
	}
}