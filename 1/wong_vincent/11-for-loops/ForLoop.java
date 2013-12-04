import java.io.*;
import java.util.*;

public class ForLoop {
    private String A=" ";
    
    public boolean isPrime(int n) {
	for (int j = 2; j < n; j = j + 1){
	    if (n % j == 0) {
		return false;
	    }
	}
	return true;
    }

    public String reverse(String a) {
	for (int b=a.length(); b>0; b=b-1){
	    System.out.print(a.substring(b-1, b));
	}
	return A;
    }

    public String table(int n, int m) {
	int a = 1;

	while (a <= n) {
	    System.out.print("  " + a);
	    a = a + 1;
	} 
	System.out.println("");

	int z = 1;

	for (int i=1; i<m+1; i=i+1) {
	    System.out.print(i + " ");
	    while (z <= n) {
		int c = i*z;
		System.out.print(c);
		z = z + 1;
		System.out.print(" ");
	    }
	    System.out.println("");
	    z = 1;
	}
	return " ";
    }
}
