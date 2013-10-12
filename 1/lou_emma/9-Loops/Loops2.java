import java.io.*;
import java.util.*;

public class Loops2 {
    public int gcd(int A, int B) {
	int smaller = B;
	int common = smaller;
	if (B > A)
	    smaller = A;
	while (A % smaller != 0 || B % smaller != 0){ //Use 'or' not 'and' because only depends if one case doesn't work
	    smaller = smaller - 1;
	}
	return smaller;
	}
	
	public int gcd2(int A, int B){
		int bigger=A;
		int smaller=B;
		if (B>A){
			smaller=A;
			bigger=B;
		}
		while (bigger % smaller !=0){
			int remainder=bigger % smaller;
			bigger=smaller;
			smaller=remainder;
		}
		return smaller;
	}
 	
	public boolean isPrime(int n){
	    boolean b=true;
		int A=n;
		int B=n-1;
		while (B>1){
		    if (gcd2(A,B) == 1)
			B = B - 1;
		    else{
			B = 1;
			b = false;
		    }
		}
		return b;
	}
		
}
