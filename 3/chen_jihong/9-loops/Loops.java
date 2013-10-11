import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	int result = n;
	if (n > 1) {
	    result = result * fact(n-1);
	} else if (n == 0) {
	    result = 0;
	} else {
	    result = 1;
	}
	return result;
    }
    public int fact2(int n){
	int i = n;
	int result = n;
	while (i > 1) {
	    result = result * (i-1);
	    i = i -1;
	}
	return result;
	    }
    public int gcd(int a, int b){
	int i = b;
	int result = 0;
	if (b > a){
	    i = a;
	    a = b;
	    b = i;
	}
        if (a%b==0){
	    return b;
	}
	while (a%i != 0 || b%i != 0){
	    i = i - 1;
	    result = i;
	}
	return result;
	}
    public int gcd2(int a, int b){
	int i = 0;
	if (b > a){
	    i = a;
	    a = b;
	    b = i;
	}
	while (b != 0){
	    i = a % b;
	    a = b;
	    b = i;
	}
	return a;
    }
    public boolean isPrime(int n){
	int temp = n-1;
	int result = 0;
	while (n%temp != 0){
	    temp = temp - 1;
	}
	 if (temp == 1){
	    return true;
	}
	return false;
    }
	    
}