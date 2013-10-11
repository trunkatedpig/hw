import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Loops l;
	int n;
	n = 5;
	l = new Loops();
	System.out.println(l.fact(n));
	System.out.println(l.fact2(n));
	System.out.println(l.gcd(12, 8));
	System.out.println(l.gcd(12, 8));
	System.out.println(l.gcd(103319, 102769));
	System.out.println(l.gcd2(103319, 102769));
	System.out.println(l.isPrime(103319));
	System.out.println(l.isPrime(4));
    }
}
