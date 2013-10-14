import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
	Loops f;
	f = new Loops ();
	System.out.println(f.fact(5));
	System.out.println(f.fact2(5));

	Divide g;
	g = new Divide ();
	System.out.println(g.GCD(25,15));
	System.out.println(g.GCD2(25,15));
	System.out.println(g.isPrime(97));

    }




}
