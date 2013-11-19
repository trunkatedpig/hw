import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	String j = new String("matthew cook");
	Reverse g = new Reverse();
	System.out.println(j);
	System.out.println(g.toReverse(j));
	System.out.println(g.isPrime(1001));
	System.out.println(g.isPrime(1002));
	System.out.println(g.table(7,6));
	System.out.println(g.table(3,5));

    }
}