import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	if (n == 0)
	    return 1;
	else{
	    return n * fact(n - 1);
	}
    }
    public int fact2(int n){
	int answ = 1;
	if(n == 0)
	    return 1;
	else{
	    while (n > 0){
		answ=answ * n;
		n = n - 1;
	    }
	    return answ;
	}
    }
    public int gcd(int a, int b){
	if (a == b){
	    return a;
	}
	else if  (a>b){
	    if (a%b != 0){
		return gcd(a, b-1);
	    }
	    else{
		return b;
	    }
	}
	else {
	    return gcd(b,a);
	}
    }
    public int gcd2(int a, int b){
	if (a==b){
	    return a;
	}
	else if (a > b){
	    if (a%b != 0){
		return gcd2(b, a%b);
	    }
	    else{
		return b;
	    }
	}
	else{
	    return gcd2(b , a);
	}
    }
    public boolean isPrime(int n){
	int d = n - 1;
	while (d > 1){
	    while (n%d != 0){
	        d = d - 1;
	    }
	    return d == 1; 
	}
	return d == 1;
    }
}
		
 

