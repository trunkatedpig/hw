import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Loops a,b,c,d;
	a = new Loops();
	b = new Loops();
	c = new Loops();
	d = new Loops();
	/*System.out.println(a.fact(4));
	System.out.println(b.fact(5));
	System.out.println(c.fact2(4));
	System.out.println(d.fact2(5));
	*/

	//Kelly Chen and Tina Lee
	/*System.out.println(a.gcd(12,12));
	System.out.println(b.gcd(12,8));
	System.out.println(c.gcd(12,4));
	System.out.println(d.gcd(12,7));
	*/
	/*System.out.println(a.gcd2(12,12));
	System.out.println(b.gcd2(12,8));
	System.out.println(c.gcd2(12,4));
	*/
        System.out.println(d.gcd2(961748941,982451653));
	System.out.println(d.gcd(1041653,1041559));
	
	/*System.out.println(a.isPrime(1));
	System.out.println(b.isPrime(23));
	System.out.println(c.isPrime(24));
	*/

	System.out.println(d.gcd(179424691,198591317));
	
    }
}
