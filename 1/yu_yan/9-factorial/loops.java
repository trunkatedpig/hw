import java.io.*;
import java.util.*;

public class loops{
    //change int to long
    public int fact(int n){
	int x;
	if (n == 0)
	    x = 1;
	else
	    x = n*(fact(n-1));
	return x;
    }
    
    public int factw(int n){
	int x = 1;
	if (n == 0)
	    x = x * 1;
	while (n > 0){
	    x = x * n;
	    n = n - 1;
	}
	return x;
    }

    // Vanessa Yan and Elise Zlotnikova
    private int l,s;
    public int GCD(int A, int B) {
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	int x = s;
	while (l%x != 0 || s%x != 0)
	    x = x - 1;
	return x;
    }

    public int GCD2(int A, int B) {
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	//if smaller int = 0, return larger
	//if remainder of larger/smaller = 0, return smaller
	//call gcd2 on remainder of larger/smaller, repeat
	while (l%s > 0){
	    int x = l%s;
	    l = s;
	    s = x;
	}
	return s;
	/*
	  int x;
	  if (s == 0)
	  return l;
	  else {
	  int r = l%s;
	    x = GCD2(s,r);
	    }
	    return x
	*/
    }
    
    public boolean isPrime(int a){
	int x = a-1;
	boolean y = true;
	while ((x > 1) && (y == true)){
		if (a%x == 0)
		    y = false;
		else
		    x = x - 1;
	    }
	return y;
    }
}
