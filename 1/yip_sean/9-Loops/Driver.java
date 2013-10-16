public class Driver {
	public static void main(String[] args) {
		Loops l = new Loops();
		System.out.println("fact(5) -> " + l.fact(5));
		System.out.println("fact2(5) -> " + l.fact2(5));
		
		long t0 = System.nanoTime();
		System.out.print("\nGCD(2,147,483,647, 2,147,483,646) -> " + l.GCD(2_147_483_647, 2_147_483_646)); //2,147,483,647 is prime and the maximum possible integer in Java
		long t1 = System.nanoTime();
		System.out.println(" | Time required: " + (t1 - t0) + " ns/" + (double) (t1 - t0)/1_000_000_000 + " s");
		
		t0 = System.nanoTime();
		System.out.print("\nGCD2(2,147,483,647, 2,147,483,646) -> " + l.GCD2(2_147_483_647, 2_147_483_646));
		t1 = System.nanoTime();	w	
		System.out.println(" | Time required: " + (t1 - t0) + " ns/" + (double) (t1 - t0)/1_000_000_000 + " s");
		
		System.out.println("\nisPrime(100) -> " + l.isPrime(100));
		
		t0 = System.nanoTime();
		System.out.print("\nisPrime(2,147,483,647) -> " + l.isPrime(2_147_483_647));
		t1 = System.nanoTime();
		System.out.println(" | Time required: " + (t1 - t0) + " ns/" + (double) (t1 - t0)/1_000_000_000 + " s");
	}
}
