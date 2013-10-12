import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Loops n1,n2,n3,n4,n5;

	n1 = new Loops();
	String result = "" + n1.fact(6);
	System.out.println(result);
	n2 = new Loops();
	String result2 = "" + n2.fact2(3);
	System.out.println(result2);

	n3 = new Loops();
	String result3 = "The gcd is" + " " + n3.gcd(300,20);
	System.out.println(result3);
        n4 = new Loops();
	String result4 = "The gcd2 is" + " " + n4.gcd2(500,18);
	System.out.println(result4);
	n5 = new Loops();
	String result5 = "The isPrime result is" + " " + n5.isPrime(15);
	System.out.println(result5);
    }
}
