//Andrew Fischer

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	loops loop;
	loop = new loops();

	System.out.println(loop.fact(5));
	System.out.println(loop.fact2(12));
	System.out.println(loop.GCD(21983, 21382));
	System.out.println(loop.GCD2(12132, 21382));
	System.out.isPrime(loop.fact2(7919));

    }
}
