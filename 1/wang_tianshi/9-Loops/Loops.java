import java.io.*;
import java.util.*;

public class Loops {
    
    private int ans, small;
    private boolean tf;

    public int fact(int n){
	if (n == 0)
	    return 1;
	else 
	    return n * fact(n - 1);
    }

    public int fact2(int n){
	ans = 1;
	while (n >= 1) {
	    ans = ans * n;
	    n = n - 1;
	}
	return ans;
    }

    public int gcd(int a, int b){
	small = a;
	if (a > b)
	    small = b;
	while (a%small != 0 || 
	       b%small != 0){
	    small = small - 1;
	}
	return small;
    }

    
    public int gcd2(int a, int b) {
	if (b==0) {
	    return a;
	}
	else {
	    return gcd2(b, a%b);
	}
    }

    public boolean isPrime(int n) {
	int var = 2;
	tf=true;
	while (var < n){
	    if (n%var ==0) {
		tf=false;
	    }
	    var = var + 1;
	}
	return tf;
    }
}
