import java.io.*;
import java.util.*;

public class GCD {
    
    public int gcd(int a, int b){
	int n,d,c,var;
	if (b>a){
	    n = b;
	    d = a;
	    var = a;}
	else {
	    n = a;
	    d = b; 
	    var = b;}
	while ((n%d!=0)|| (var%d!=0)) {
	    d = d - 1;
	}
	c = d;
	return c;
    }

    public int gcd2(int a, int b){ // this is muchmuchmuch faster
	int n, d, c;
	if (b>a){
	    n = b;
	    d = a;
	}
	else {
	    n = a;
	    d = b;
	}
	while (n%d != 0){
	    int temp = n%d;
	    n = d;
	    d = temp;
	}
	return d;
    }
    public boolean isPrime(int n){
	if (n <= 1){
	    return false;
	}
	else {
	    int temp = n - 1;
	    while  (n % temp != 0 && temp > 1){
		temp = temp - 1;
	    }
	    if (temp <= 1){
		return true;
	    }
	    else {
		return false;
	    }
	}
    }
}
     


