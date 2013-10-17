import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops l = new Loops();

	System.out.println("testing fact");
	System.out.println(l.fact(13));
	System.out.println(l.fact(3));

	System.out.println("testing fact2");
	System.out.println(l.fact2(13));
	System.out.println(l.fact2(6));   

	System.out.println("GCD");
	System.out.println(l.gcd(24,656));
	System.out.println("GCD2");
	System.out.println(l.gcd2(24,34));
	System.out.println(l.gcd2(3,84));
	System.out.println("isPrime");
	System.out.println(l.isPrime(13));
	System.out.println(l.isPrime(10));
	System.out.println(l.isPrime(79));

    }
}
