import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Loops x = new Loops();
	
	System.out.println(x.fact(1));
	System.out.println(x.fact(5));
	System.out.println("Above = recursion. Below = while");
	System.out.println(x.fact2(1));
	System.out.println(x.fact2(5));

	System.out.println("\nGCD of a and b simple");
	System.out.println(x.gcd(40960001, 9123));

	System.out.println("\nGCD of a and b euclid");
	System.out.println(x.gcd(40960001, 9123));

	System.out.println(x.isPrime(40960001));

	
    }
}