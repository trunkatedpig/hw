import java.io.*;
import java.util.*;

public class Loops {
    private int s;

    public int fact(int n){
	if (n == 0){
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}	
    }
    
    public int fact2(int n){
	s = 1;
	while (n>0){
	    s = s * n;
	    n = n - 1;
    }
	return s;
    }

    public int gcd(int a, int b){
        int s = Math.min(a, b);
        while (s > 1){
            if (a%s == 0 && b%s == 0){
                return s;
            }
            else{
                s = s-1;
            }
        }
        return 1;
    }

    Public int gcd2(int a, int b){
	int g = Math.max(a, b);
	int s = Math.min(a, b);
	while (s > 0){
	    int r;
	    r = g%s;
	    if (r == 0) {
		return s;
	}
	    g = s;
	    s = r;
	    
	}
	    return g;
    }

    public boolean isPrime(int n){
	int d;
	d = n -1;
	while (d >= 1){
	    if (n%d == 0){
		return d ==1;
	    }
	    else {
		d = d - 1;
	    }
	}
	return d == 1;
	
    }

}
