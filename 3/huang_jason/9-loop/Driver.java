public class Driver{
    
    public static void main(String[] args){
	Loops l = new Loops();

	System.out.println(l.fact(1));
	System.out.println(l.fact(3));
	System.out.println(l.fact(5));

	System.out.println(l.fact2(2));
	System.out.println(l.fact2(4));
	System.out.println(l.fact2(6));

	System.out.println(l.gcd(100000000,100000001));
	System.out.println(l.gcd2(100000000,100000001));
	System.out.println(l.isPrime(100000001));
    }
}