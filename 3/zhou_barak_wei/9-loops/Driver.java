import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		System.out.println(Loops.fact(5)); //120
		System.out.println(Loops.fact(1)); //1
		System.out.println(Loops.fact(0)); //1
	
		System.out.println(Loops.fact2(5)); //120
		System.out.println(Loops.fact2(1)); //1
		System.out.println(Loops.fact2(0)); //1

		System.out.println(Loops.gcd(12, 8)); //4
		System.out.println(Loops.gcd2(12, 8)); //4

		System.out.println(Loops.isPrime(17)); //true
		System.out.println(Loops.isPrime(80)); //false
	}
}