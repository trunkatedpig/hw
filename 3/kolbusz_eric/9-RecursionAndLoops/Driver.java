import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	LoopStuff f;
	f = new LoopStuff();
	
	System.out.println(f.fact(-2)); //0
	System.out.println(f.fact(0)); //1
	System.out.println(f.fact(5)); //120
	
	System.out.println(f.fact2(-2)); //0
	System.out.println(f.fact2(0)); //1
	System.out.println(f.fact2(5)); //120

	System.out.println(f.gcd(6,30)); //6
	System.out.println(f.gcd(47,53)); //1
	System.out.println(f.gcd(36,90)); //18

	System.out.println(f.gcd2(6,30)); //6
	System.out.println(f.gcd2(47,53)); //1
	System.out.println(f.gcd2(36,90)); //18

	System.out.println(f.isPrime(2)); //True
	System.out.println(f.isPrime(12)); //False
	System.out.println(f.isPrime(47)); //True	
    }
}
