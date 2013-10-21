import java.io.*;
import java.util.*;

public class Driver{
     public static void main (String [] args){
	 Loops t = new Loops();
 	 System.out.println(t.fact(5));
	 System.out.println(t.fact(4));
	 System.out.println(t.fact(3));
	 System.out.println(t.fact2(5));
	 System.out.println(t.fact2(4));
	 System.out.println(t.fact2(3));
	 System.out.println();
	 System.out.println(t.gcd(2,4));
	 System.out.println(t.gcd2(2,4));
	 System.out.println(t.gcd2(16,13));
	 System.out.println(t.gcd2(160,20));
	 System.out.println();
	 System.out.println(t.isPrime(13));
	 System.out.println(t.isPrime(14));

     }
}
