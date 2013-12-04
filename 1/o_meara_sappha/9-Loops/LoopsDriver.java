import java.io.*;
import java.util.*;

public class LoopsDriver {
    public static void main (String[] args) {
        Loops loop;
	loop = new Loops();
	System.out.println(loop.fact(0));
	System.out.println(loop.fact(5));
	System.out.println(loop.fact(10));
	System.out.println(loop.fact2(0));
	System.out.println(loop.fact2(5));
	System.out.println(loop.fact2(10));
	System.out.println(loop.GCD(9, 21));
	System.out.println(loop.GCD2(69, 3));
	System.out.println(loop.GCD(3559, 3571));
        System.out.println(loop.GCD2(3571, 3559));
	System.out.println(loop.isPrime(4348092));
	System.out.println(loop.isPrime(3571));
    }
}
