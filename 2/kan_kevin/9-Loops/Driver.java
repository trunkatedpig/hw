import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
	Loops f = new Loops();
	System.out.println(f.fact(5));
	System.out.println(f.fact2(5));
	System.out.println(f.GCD(12,8));
	System.out.println(f.GCD2(12,8));
	System.out.println(f.isPrime(17));
	System.out.println(f.isPrime(16));

    }
}
