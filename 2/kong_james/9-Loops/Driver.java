import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args){
	Loops a = new Loops();
	System.out.println(a.fact(10));
	System.out.println(a.fact2(10));
	System.out.println(a.fact(5));
	System.out.println(a.fact2(5));
	System.out.println(a.fact(3));
	System.out.println(a.fact2(3));
	System.out.println(a.GCD(20,15));
	System.out.println(a.GCD(733,797));
	System.out.println(a.GCD2(20,15));
	System.out.println(a.GCD2(733,797));
	System.out.println(a.isPrime(1000));
	System.out.println(a.isPrime(13));
    }
}
