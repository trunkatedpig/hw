public class Driver {
    public static void main (String[] args) {
	Loops a = new Loops();
	System.out.println(a.fact(0));
	System.out.println(a.fact(5));
	System.out.println(a.fact2(0));
	System.out.println(a.fact2(5));
	System.out.println(a.GCD(3, 15));
	System.out.println(a.GCD2(21, 7));
	System.out.println(a.isPrime(313));
    }
}
