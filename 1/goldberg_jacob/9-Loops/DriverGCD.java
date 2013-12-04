public class DriverGCD{
	public static void main(String[] args){
		GCD g =  new GCD();
		 
		
		System.out.println(g.GCD(6, 13));
		System.out.println(g.GCD(6, 12));
		System.out.println(g.GCD(6, 10));
		System.out.println(g.GCD(8, 16));
		System.out.println(g.GCD(20, 25));

		System.out.println(g.GCD2(6, 13));
		System.out.println(g.GCD2(6, 12));
		System.out.println(g.GCD2(6, 10));
		System.out.println(g.GCD2(8, 16));
		System.out.println(g.GCD2(20, 25));

		System.out.println(g.isPrime(13));
		System.out.println(g.isPrime(11));
		System.out.println(g.isPrime(17));
		System.out.println(g.isPrime(22));
		System.out.println(g.isPrime(100));
		System.out.println(g.isPrime(90));
		System.out.println(g.isPrime(2435));	
	
	}}
