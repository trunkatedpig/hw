import java.io.*;
import java.util.*;

public class Loops { 
    private int p=1;
    private int q,r,s;
    public int fact(int n){
	if (n ==0) {
	    return 1;
	}
	else {
	    return n* fact(n-1);
	}      
    }
    public int fact2(int n){
	int count = n;
	int result = 1;
	while (n!=0) {
	    result = result*n;
	    n=n-1;
	}
	return result;
    }
}