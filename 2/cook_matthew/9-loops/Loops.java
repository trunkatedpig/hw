import java.io.*;
import java.util.*;

public class Loops { 
    private int p=1;
    private int q,r,s;
    public int fact(int n){
	if (n > 1) {
        p= p*n;
	n=(n-1);
        fact(n);
	}
	return p;
    }
    public int fact2(int n){
	q=1;
	while (n>1) {
	    q=q*n;
	    n=n-1;
	}
	return q;
    }
}