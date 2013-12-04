import java.io.*;
import java.util.*;

public class LoopDriver {
    public static void main (String [] args) {
	Loops l = new Loops();
	
	System.out.println (l.fact(5));
	System.out.println (l.fact(10));
	System.out.println (l.fact(33));

	System.out.println (l.fact2(5));
	System.out.println (l.fact2(10));
	System.out.println (l.fact2(33));

	System.out.println (l.gcd(68,16));
	System.out.println (l.gcd2(68,16));

	System.out.println (l.isPrime(27751));
    }
}

