import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops f1, f2;
	f1 = new Loops();
	f2 = new Loops();
	System.out.println("1! = " + f1.fact(1));
	System.out.println("2! = " + f2.fact2(2));
	System.out.println("3! = " + f1.fact(3));
	System.out.println("4! = " + f2.fact2(4));
	System.out.println("5! = " + f1.fact(5));
	System.out.println("6! = " + f2.fact2(6));

	System.out.println(f1.gcd(12,8));
	System.out.println(f1.gcd(8,12));
	System.out.println(f1.gcd(75,25));
	System.out.println(f1.gcd(13,7));
	

	
    }
}
