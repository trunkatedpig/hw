public class Driver {
    public static void main(String[] args) {
	Loops l = new Loops();
	long startTime;
	long endTime;

	System.out.println(l.fact(1));
	System.out.println(l.fact(5));
	System.out.println(l.fact(10));
	System.out.println(l.fact(100));
	System.out.println();
	System.out.println("TEST #1");
	//Test #1... Is it possible to make a method that takes a function?
	//e.g. public static long time(function)

	startTime = System.nanoTime();
	System.out.println(l.GCD(100, 105));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2(100, 105));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2L(100, 105));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	//Test #2

	System.out.println();
	System.out.println("TEST #2");

	startTime = System.nanoTime();
	System.out.println(l.GCD(23451, 15123));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2(23451, 15123));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2L(23451, 15123));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	//Test #3

	System.out.println();
	System.out.println("TEST #3");

	startTime = System.nanoTime();
	System.out.println(l.GCD(23451237, 9235235));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2(23451237, 9235235));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	startTime = System.nanoTime();
	System.out.println(l.GCD2L(23451237, 9235235));
	endTime = System.nanoTime();
	System.out.println("Time: " + (endTime - startTime));

	//isPrime Tests

	System.out.println();
	System.out.println(l.isPrime(17));
	System.out.println(l.isPrime(91));
	System.out.println(l.isPrimeL(17));
	System.out.println(l.isPrimeL(91));
	System.out.println(l.isPrimeL(1));
	System.out.println(l.isPrimeL(2));
	System.out.println("---------------------------");
	l.backwards("Hi my name is");
    }
}
