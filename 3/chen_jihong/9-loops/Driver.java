import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Loops n = new Loops();
	long l1 = 32416190071L;
	long l2 = 32416189381L;
	System.out.println("Factorial 1");
	System.out.println(n.fact(3));
	System.out.println(n.fact(5));
	System.out.println(n.fact(0));
	System.out.println("Factorial 2");
	System.out.println(n.fact2(3));
	System.out.println(n.fact2(5));
	System.out.println(n.fact2(0));
	System.out.println("GCD 1");
	System.out.println(n.gcd(12,8));
	System.out.println(n.gcd(50,60));
	System.out.println(n.gcd(9949, 9767));
	System.out.println(n.gcdf(12,8));
	//it takes too long to find the gcd of large number with brute force method
	System.out.println("GCD 2");
	System.out.println(n.gcd2(12,8));
	System.out.println(n.gcd2(50,60));
	System.out.println(n.gcd2(9949, 9767));
	System.out.println(n.gcd(l1,l2));
	System.out.println("Prime?");
	System.out.println(n.isPrime(50));
	System.out.println(n.isPrime(9949));
	System.out.println(n.isPrime(225));
    }

}