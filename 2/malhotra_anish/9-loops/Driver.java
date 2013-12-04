import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
	
	Loops x = new Loops();
	Loops y = new Loops();
	Loops z = new Loops();
	System.out.println(x.fact(1));
	System.out.println(x.fact2(1));
	System.out.println("<--------------------------------------------->");
	System.out.println(x.fact(2));
	System.out.println(y.fact2(2));
	System.out.println("<--------------------------------------------->");
	System.out.println(x.fact(5));
	System.out.println(z.fact2(5));
	System.out.println("<--------------------------------------------->");
	GCD a = new GCD();
	GCD b = new GCD();
	GCD c = new GCD();
	//System.out.println(b.gcd2(2500,500));
	//System.out.println(b.gcd2(2500,500));
	//System.out.println(c.gcd2(7919,5413));
	System.out.println(b.gcd1(7919,5413));
	System.out.println(c.gcd2(7919,5413));
	System.out.println(b.isPrime(17));
	
	
	
	
	}



}