import java.io.*;
import java.util.*;

public class Driver {	
	public static void main(String args[]) {
		Loops l;
		l = new Loops();
		System.out.println(l.fact(5));
		System.out.println(l.fact(7));
		System.out.println(l.fact2(5));
		System.out.println(l.fact2(7));
		System.out.println(l.gcd(36, 90));
		System.out.println(l.gcd(90, 36));
		System.out.println(l.gcd2(36, 90));
		System.out.println(l.gcd(527737963, 53781811));
		System.out.println(l.gcd2(527737963, 53781811));
		System.out.println(l.isPrime(1));
		System.out.println(l.isPrime(2));
		System.out.println(l.isPrime(3));
		System.out.println(l.isPrime(4));
		System.out.println(l.isPrime(5));
		System.out.println(l.isPrime(8));
		System.out.println(l.isPrime(80));
		System.out.println(l.isPrime(7));
		System.out.println(l.isPrime(37));
		System.out.println(l.isPrime(421));
		System.out.println(l.isPrime(3253));
		System.out.println(l.isPrime(11173));
		System.out.println(l.isPrime(393919));
		System.out.println(l.isPrime(4514113));
		System.out.println(l.isPrime(53781811));
		System.out.println(l.isPrime(527737963));
		System.out.println(l.isPrime(527737967)); //not prime
	}

}
