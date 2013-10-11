import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Loops n = new Loops();
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
	System.out.println(n.gcd(2922509,3276509));
	System.out.println("GCD 2");
	System.out.println(n.gcd2(12,8));
	System.out.println(n.gcd2(50,60));
	System.out.println(n.gcd2(9949, 9767));
	System.out.println(n.gcd(2922509,3276509));
	System.out.println("Prime?");
	System.out.println(n.isPrime(50));
	System.out.println(n.isPrime(9949));
	System.out.println(n.isPrime(225));
    }

}