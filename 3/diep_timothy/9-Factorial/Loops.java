import java.io.*;
import java.util.*;

public class Loops {

    /* I didn't put product as an instance so that I 
       would be able to use the method fact multiple
       times in a row */

    public int fact(int n) {
	int product = 1;
	if (n == 1) {
	    return product;
	} else {
	    product = n * fact(n-1);
	}
	return product;
    }
    
    public int fact2(int n) {
	int product = 1;
	while (n != 1) {
	    product = product * n;
	    n = n - 1;
	}
	return product;
    }


    public int gcd(int a, int b) {
	int c;
	if (a > b){ 
	    c = b;}
	else {
	    c = a;}
	while (a%c!=0 || b%c!=0) {
	    c = c -1;}
	return c;
    }
}

	    
