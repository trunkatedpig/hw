public class Driver {
    public static void main(String[] args) {
	Loops l = new Loops();

	System.out.println(l.fact(5));
	System.out.println(l.fact2(5));
	System.out.println(l.fact(4));

	System.out.println(l.gcd(12,8));
	System.out.println(l.gcd2(12,8));

	System.out.println(l.isPrime(2));
	System.out.println(l.isPrime(83));
	System.out.println(l.isPrime(75));
    }
}
