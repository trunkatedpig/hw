import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	Loop f1, f2;
	f1 = new Loop();
	f2 = new Loop();

	System.out.println(f1.fact(1));
	System.out.println(f1.fact(15));
	System.out.println(f1.fact(10));
	System.out.println(f1.fact(8));
	System.out.println(f1.fact(5));

	System.out.println(f2.fact2(1));
	System.out.println(f2.fact2(15));
	System.out.println(f2.fact2(10));
	System.out.println(f2.fact2(8));
	System.out.println(f2.fact2(5));

	Divide g;
	g = new Divide();

	System.out.println(g.GCD(25, 15));
	System.out.println(g.GCDfor(25, 15));
	System.out.println(g.GCD2(25, 15));
	System.out.println(g.isPrime(97));
	System.out.println(g.isPrime(91));

    }

}