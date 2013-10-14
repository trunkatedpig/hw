import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops Loop; 
	Loop = new Loops();
	/*
	System.out.println(Loop.fact(0));
	System.out.println(Loop.fact(2));
	System.out.println(Loop.fact(3));
	System.out.println(Loop.fact2(0));
	System.out.println(Loop.fact2(2));
	System.out.println(Loop.fact2(3));
	System.out.println(Loop.isPrime(13));
	System.out.println(Loop.isPrime(81));
	System.out.println(Loop.isPrime(3));
	System.out.println(Loop.GCD(2,5));
	System.out.println(Loop.GCD(13,92));
	System.out.println(Loop.GCD(96,2));
	*/
	System.out.println(Loop.GCD2(2,5));
	System.out.println(Loop.GCD2(13,92));
	System.out.println(Loop.GCD2(96,2));
    }
}
