public class Driver {
    public static void main(String[] args){
	Loops tester = new Loops();
	System.out.println(tester.fact(0));
	System.out.println(tester.fact(1));
	System.out.println(tester.fact(2));
	System.out.println(tester.fact(5));
	System.out.println(tester.fact(0));
	System.out.println(tester.fact(1));
	System.out.println(tester.fact(2));
	System.out.println(tester.fact(5));
	
	System.out.println(tester.gcd(12,8));
	System.out.println(tester.gcd(8,12));
	System.out.println(tester.gcd(5,5));

	System.out.println(tester.gcd2(12,8));
	System.out.println(tester.gcd2(8,12));
	System.out.println(tester.gcd2(5,5));

	System.out.println(tester.isPrime(577));
	System.out.println(tester.isPrime(2111));
	System.out.println(tester.isPrime(69));

    }
}
