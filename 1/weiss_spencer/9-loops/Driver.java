public class Driver {
    public static void main(String[] args) {
	Loops l = new Loops();
	System.out.println(l.fact(1));
	System.out.println(l.fact(4));
	System.out.println(l.fact(5));
	System.out.println(l.fact(30));
	System.out.println(L.fact2(4));
	System.out.println(L.fact2(10));
	System.out.println(L.GCD(8,12));
	System.out.println(L.GCD2(40,100));
	System.out.println(L.GCD(9129,2344));
        System.out.println(L.GCD2(4521,102938));
	System.out.println(L.isPrime(1));
	System.out.println(L.isPrime(2));
	System.out.println(L.isPrime(24));
	System.out.printLn(L.isPrime(29));
    }
}
