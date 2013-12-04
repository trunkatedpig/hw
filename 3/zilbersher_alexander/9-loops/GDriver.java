import java.io.*;
import java.util.*;


public class GDriver{
    public static void main(String[] args) {
	Gcd g1 = new Gcd();

	System.out.println(g1.gcd(4,6));
	System.out.println(g1.gcd(5,7));
	System.out.println(g1.gcd(12,24));
	System.out.println(g1.gcd2(6,8));
	System.out.println(g1.gcd2(2,9));
	System.out.println(g1.gcd2(136,28));
	System.out.println(g1.isPrime(137));
	System.out.println(g1.isPrime(169));
	System.out.println(g1.isPrime(13));
    }
}

    