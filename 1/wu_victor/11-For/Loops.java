import java.io.*;
import java.util.*;

public class Loops {

    public int gcd (int a, int b) {
	for (int c=a; c>0; c=c-1) {
	    if (a%c==0 && b%c==0)
		return c;
	}
	return 1;
    }

    public String reverse (String a) {
	for (int c=a.length(); c>0; c=c-1) {
	    System.out.print(a.substring(c-1, c));
	}
        String z = " ";
	return z;
    }

    public String table (int n, int m) {
	// 0 to N
	int a = 0;
	while (a<n+1) {
	    System.out.print(a+" ");
	    a = a+1;
	}
	System.out.println(" ");
	
	// The Rest
	int z = 1;
	String x = " ";
	for (int b=1; b<m+1; b=b+1) {
	    System.out.print(b+x);
	    while (z<=n) {
		int c = b*z;
		System.out.print(c);
		z = z+1;
		System.out.print(x);
	    }
	    System.out.println(x);
	    z = 1;
	}
	return " ";
    }

}
