import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Loop l = new Loop();
	System.out.println(l.fact(3));
	System.out.println(l.fact2(3));
	System.out.println(l.gcd(12,8));
	System.out.println(l.gcd2(12,8));
	System.out.println(l.isPrime(17));
    }
}
