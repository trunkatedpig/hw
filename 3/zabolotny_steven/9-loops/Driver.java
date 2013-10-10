public class Driver {
    public static void main(String[] args) {
	Loops l = new Loops();
	System.out.println(l.fact(5) + " should be 120.");
	System.out.println(l.fact2(3) + " should be 6.");
	System.out.println(l.gcd(20,30) + " should be 10.");
	System.out.println(l.gcd2(40,60) + " should be 20.");
    }
}