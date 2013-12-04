import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * fact(n - 1);
	}
    }
    public int fact2(int n){
	int result = 1;
	while (n > 1) {
	   result = result * n;
	   n = n - 1;
	}
	return result;
    }
/*------------------------------------*/
/* ~10/10/13~ */
    private int small, big;
    public void BiggieSmalls(int a, int b){
	if (a > b){
	    big = a;
	    small = b;}
	else {
	    big = b;
	    small = a;}
    }

    public int GCD(int a, int b){
	BiggieSmalls(a, b);
	int GCD = 1;
	int count = small;
	while (count != GCD) {
	    if (a % count == 0 && b % count == 0){
		GCD = count ;}
	    else {
		count = count - 1;}
	}
	return GCD;
    }
    // I didn't understand how this worked. Code taken from Eric Wong. 
    public int GCD2(int a, int b){
	BiggieSmalls(a, b);
	int r;
	while (small != 0) {
	    r = small;
	    small = big % small;
	    big = r;
	} 
	return big;
    }

    public boolean isPrime(int a){
	int count = a - 1;
	if (a == 0 || a == 1){
	    return false;}
	else if (a == 2) {
	    return true;}
	else {
	    while (a % count != 0){
		count = count - 1;}
	    if (count == 1){
		return true;}
	    else {
		return false;
	    }
	}
    }
	
		    

		    
}
