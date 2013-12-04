import java.io.*;
import java.util.*;

public class Loop{
    public int fact(int n){
	int result = 1;
	if (n == 0){
	    result = 1;
	} else if (n ==1){
	    result = n * result;
	} else{
	    result = n * (n-1);
	    n = n-1;
	    fact(n);
	}
	return result;
    } 

    public int fact2(int n){
	int result = 1;
	while (n >= 1){
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }
    public int gcd (int a, int b){
	int c = b;
	int ans;
	while (c > 0 && (a%c != 0 || b%c != 0)){
	    c = c - 1;
	}
	ans = c;
	return ans;
    }
    
    public int gcd2(int a, int b){
	while (b != 0){
	    int r = a%b;
	    return gcd2(b,r);
	}
	return a;
    }

    public boolean isPrime(int n){
	int i = n - 1;
	boolean ans = true;
	while (i > 1 && ans == true){
	    if (n%i == 0){
		ans = ans && false;
	    }else{
		i = i - 1;
	    }
	}
	return ans;
    }

}
