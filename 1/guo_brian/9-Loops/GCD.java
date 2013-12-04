import java.io.*;
import java.util.*;
 
public class GCD {
    
    public int GCD (int A,int B) {
	int a = 2;
	int f = 1;
	while (a-1<A) {
	    if (A % a == 0 && B % a == 0) {
		f = f*a;
		A = A/a;
		B = B/a;
		a = 2;
	    }
	    else {
		a = a +1;
	    }
	}
	return f;
    }
    public int GCD2 (int a, int b){
	if (b==0) {
	    return a;
	}
	else {
	    return (GCD2 (b,(a%b)));
	}
    }

    public boolean isprime(int n) {
	int a = n / 2;
	int f = 2;
	while (f<a) {
	    if (n%f==0) {
		return false;
	    }
	    else {
		f = f+1;
	    }
	}
	return true;
    }
}
	   
		