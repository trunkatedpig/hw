import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	/*	Loops L = new Loops();
	System.out.println(L.fact(5));
	System.out.println(L.fact2(5));*/

	GCDenominator G = new GCDenominator();
	System.out.println(G.GCD(120,40));
	System.out.println(G.GCD(30,20));
	System.out.println(G.GCD(99,6));
	System.out.println(G.GCD2(120,40));
	System.out.println(G.GCD2(30,20));
	System.out.println(G.GCD2(99,6));
	System.out.println(G.GCD2(7,5));

	System.out.println(G.isPrime(59));
	System.out.println(G.isPrime(57));
	System.out.println(G.isPrime(2));
    }
}
