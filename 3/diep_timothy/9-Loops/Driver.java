import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops f1, f2;
	f1 = new Loops();
	f2 = new Loops();
	System.out.println("1! = " + f1.fact(1));
	System.out.println("2! = " + f2.fact2(2));
	System.out.println("3! = " + f1.fact(3));
	System.out.println("4! = " + f2.fact2(4));

	System.out.println(f1.gcd(12,8));
	System.out.println(f1.gcd(8,12));
	System.out.println(f1.gcd(75,25));
	System.out.println(f1.gcd(13,7));

	System.out.println(f1.gcd2(63,14));
	System.out.println(f1.gcd2(18,9));
	System.out.println(f1.gcd2(9,18));
	System.out.println(f1.gcd2(1213, 1447));

	System.out.println(f1.IsPrime(18));
	System.out.println(f1.IsPrime(2));
	System.out.println(f1.IsPrime(79));
	System.out.println(f1.IsPrime(1213));

	System.out.println(f1.IsPrime(18));
	System.out.println(f1.IsPrime(2));
	System.out.println(f1.IsPrime(79));
	System.out.println(f1.IsPrime(1213));
	
    }
}
