import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		Loops l = new Loops();
		System.out.println(l.fact(6));
		System.out.println(l.fact(1));
		System.out.println(l.fact2(6));
		System.out.println(l.fact2(1));
		System.out.println(l.gcd(12,8));
		System.out.println(l.gcd2(12,8));
		System.out.println(l.gcd2(11,33));
		System.out.println(l.isPrime(77));
		System.out.println(l.isPrime(31));

	}
}
