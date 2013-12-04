//Andrew Fischer

import java.io.*;
import java.util.*;

public class loops {
    private int result;
    

    public int fact(int n) {   //Recursive
	if(n == 0){
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n) { //Iterative
	int result = 1;
	while (n != 0){
	    result = result * n;
	    n = n-1;
	}
    }

    public int GCD(int a, int b) { //Recursive
	
	int temp, count;
	if (a < b)
	    {   
		a = temp;
		a = b;
		b = temp;
	    }
	count = b;
	while (a%count != 0 && b&count != 0) {
	    return count;
	}
	count = count - 1;   
    }

    public int GCD2(int a, int b){  //Iterative
	if (b == 0){
	    return a;
	}
	else if ( a==0 ){
	    return b;
	}
	else {
	    while (a != b) {
		if (a>b) {
		    a = a%b;
		}
		else {
		    b = b%a;
		}
	    }
	}
    }

    public boolean isPrime(int n) {
	int count = 2;
	while (count < n) {
	    if (n % count == 0) {return false;}
	    else {count = count + 1;}
	}
	return true;
    }
}
