import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Loops l = new Loops();
	System.out.println(l.fact(5));
	System.out.println(l.fact2(1));
	System.out.println(l.fact2(4));
	System.out.println(l.gcd(12,8));
	System.out.println(l.gcd2(12,8));
	System.out.println(l.gcd(7919,7907));
	System.out.println(l.gcd2(7919,7907));
	System.out.println(l.isPrime(7919));
	System.out.println(l.isPrime(24));
    }
}