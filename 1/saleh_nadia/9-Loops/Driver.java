import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Loops a = new Loops ();
	System.out.println (a.fact(5));
	System.out.println (a.fact2(5));
	System.out.println (a.GCD(225,39));
	System.out.println (a.GCD2(225,39));
        System.out.println (a.isPrime(12));
	System.out.println (a.isPrime(7));
    }
}
