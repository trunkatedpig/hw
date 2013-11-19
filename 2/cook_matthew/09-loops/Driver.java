import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops s= new Loops();
	GCD g = new GCD();
	System.out.println(s.fact(5));//should be 120
	System.out.println(s.fact2(5));
	/*System.out.println(s.fact2(7));
	System.out.println(s.fact2(9));
	System.out.println(s.fact2(11));
	System.out.println(s.fact2(13));
	System.out.println(s.fact2(15));
	*/
	System.out.println(g.GCD(8,12));
	System.out.println(g.GCD(1001,1003));
	System.out.println(g.GCD(1002,1005));
	System.out.println(g.GCD2(8,12));
        System.out.println(g.GCD2(1001,1003));
        System.out.println(g.GCD2(1002,1005));
	System.out.println(g.GCD2(693,441));
	System.out.println(g.isPrime(693));
	System.out.println(g.isPrime(80347));
	System.out.println(g.isPrime(104729));


    }
}