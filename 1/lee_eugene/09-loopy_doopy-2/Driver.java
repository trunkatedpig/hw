import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Loop l = new Loop();
	System.out.println("GCD Testing");
        System.out.println(l.gcd(1000,50));
        System.out.println(l.gcd2(1000,50));
	System.out.println("Large GCD Testing");
	System.out.println(l.gcd(152057,135749));
        System.out.println(l.gcd2(152057,135749)); // This is much faster
	System.out.println("Prime Testing");
        System.out.println(l.isPrime(11));
        System.out.println(l.isPrime(7919));
	System.out.println(l.isPrime2(11));
        System.out.println(l.isPrime2(7919));
	System.out.println("Prime 2 Testing");
    }
}