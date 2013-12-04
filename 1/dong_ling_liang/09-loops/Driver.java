import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Loops a = new Loops();
	System.out.println(a.fact(0));
	System.out.println(a.fact(-1));
	System.out.println(a.fact(1));
	System.out.println(a.fact(4));
	
	System.out.println(a.fact2(4));
	System.out.println(a.fact2(-1));
	System.out.println(a.fact2(0));

	GCD b = new GCD();
	System.out.println("GCD TESTING BELOW");
	System.out.println(b.gcd(5, 5) + " should be 5");
	System.out.println(b.gcd(80, 100) + " 20");
	System.out.println(b.gcd(373, 727) + " 1");
	System.out.println(b.gcd2(5, 5) + " should be 5");
        System.out.println(b.gcd2(100, 80) + " 20");
        System.out.println(b.gcd2(373, 727) + " 1");
	System.out.println(b.isPrime(727) + " Trueueueu");
	System.out.println(b.isPrime(20) + " Falseu");
	System.out.println(b.isPrime(2) + " True");

	System.out.println(b.gcd(593428597, 256199087) + " 1");
	System.out.println(b.gcd2(593428597, 256199087) + " 1");

    }
}