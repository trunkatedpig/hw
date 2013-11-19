import java.io.*;
import java.util.*;

public class Loops {

    private int hold;
    private int dcg;

    public Loops () {
	hold = 1;
    }

    public int fact (int n) {
	if ( n == 0 )
	    return 1;
	else
	    return n * fact(n - 1);
    }

    public int fact2 (int n) {
	while (n > 0) {
	    hold = hold * n;
	    n = n - 1;
	}

	return hold;
    }

    public int gcd (int a, int b) {
	if ( a < b )
	    dcg = a;
	else
	    dcg = b;
	    
	while ( dcg > 0 ) {
	    if (a%dcg==0 && b%dcg==0) 
		return dcg;
	    dcg = dcg - 1;
	}
	return 1;
    }

    public int gcd2 (int a, int b) {
	if ( a < b )
	    gcd2(b,a);

	while (a%b != 0) {
	    if (a%b==0)
		return b;
	    gcd2(b, a%b);
	}
	
	return 1;
    }

    public String prime (int a) {
	dcg = a-1;

	while ( dcg > 1 ) {
	    if (a%dcg==0)
		return "false";
	    dcg = dcg - 1;
	}

	return "true";
    }

    public int gcda (int a, int b) {
	for(dcg = a; dcg > 0; dcg=dcg-1) {
	    if ( a%dcg==0 && b%dcg==0)
		return dcg; 
	}
		return 1;
    }

    public String reverse (String a) {
	for (int i = a.length();i>0;i=i-1){
	    System.out.print(a.substring(i-1, i));
	}
	System.out.println("");
	return null;
    }
}
