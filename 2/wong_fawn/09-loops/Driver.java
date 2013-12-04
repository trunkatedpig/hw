import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	Loops a = new Loops();
        //System.out.println(a.fact(5));
        //System.out.println(a.fact2(5));
		System.out.println(a.GCD(73303,103979));
		System.out.println(a.GCD2(73303,103979));
		System.out.println(a.GCD(30,15));
		System.out.println(a.GCD2(30,15));
		System.out.println(a.isPrime(103979));
		System.out.println(a.isPrime(8));
    }
}