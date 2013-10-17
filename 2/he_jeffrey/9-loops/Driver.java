import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Fact q;
	Loop v;
	q = new Fact();
	System.out.println(q.fact(5));
	System.out.println(q.fact2(5));

	v = new Loop();
	System.out.println(v.gcd(314606891,104395303));
	System.out.println(v.gcd2(314606891,104395303));

	System.out.println(v.isPrime(4));
	System.out.println(v.isPrime(314606891));
    }
}
