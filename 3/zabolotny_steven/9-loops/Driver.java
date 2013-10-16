public class Driver {
    public static void main(String[] args) {
	Loops l = new Loops();
	System.out.println(l.fact(5) + " should be 120.");
	System.out.println(l.fact2(3) + " should be 6.");
	System.out.println(l.gcd(20,30) + " should be 10.");
	System.out.println(l.gcd2(40,60) + " should be 20.");
	System.out.println(l.gcdfor(76,144) + " should be 4.");
	System.out.println(l.isPrime(13) + " should be true.");
	System.out.println(l.isPrime(24) + " should be false.");
	System.out.println(l.gcdcount(7919,7829) + " times loop is run. (COUNT METHOD!)");
	System.out.println(l.gcd2count(7919,7829) + " times loop is run. (THEOREM LOOP!)\nThe theorem method is significantly faster, but it makes a very minor difference with respect to time.");
	System.out.println(l.reverse("Hello") + " should be olleH.");
    }
}