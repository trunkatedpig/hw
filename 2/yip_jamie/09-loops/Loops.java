import java.io.*;
import java.util.*;

public class Loops{
    private int result;

    public int fact(int n){
	if (n == 1){
	    return 1;
	} 
	else
	    { 
		return n * fact(n-1);
	    }
    }

    /*   While Loop
	 public int fact2(int n){
	result = 1;
	while (n >= 1){
	    result = result * n;    
	    n = n-1;
	}
	return result;
    }

    */

    //For Loop
    public int fact2 (int n){
	for (result = 1;n>=1; n=n-1){
	    result = n * result;
	}
	return result;
    }
    public int GCD (int a, int b) {
	int smallernum, biggernum, count,GCD;
	if (a > b) {
	    smallernum = b;
	    biggernum = a;
	}
	else 
	    {
		smallernum = a;
		biggernum = b;
	    }
	count = smallernum;
	GCD = 1;
	while (count != GCD){
	    if (a % count == 0 && b % count ==0){
		GCD = count;
	    }
	    else count = count -1;
	}
	return GCD;
    }
    

	/*
	    if (biggernum % smallernum == 0) {
	    return smallernum;
	}
	else 
	    {
		return  GCD(biggernum, (smallernum - 1));
	    }
    }*/

    public int GCD2 (int a, int b) {
	int r, smallernum, biggernum;
	if (a > b) {
	    smallernum = b;
	    biggernum = a;
	}
	else 
	    {
		smallernum = a;
		biggernum = b;
	    }
	
	r = biggernum % smallernum;
	while (r != 0) {
	    biggernum = smallernum;
	    smallernum = r;
	}
	return smallernum;
    }

    public boolean isPrime (int n){
	int r = 2;
	if (n == 1) {
	    return false;}
	while ((n/2) > r){
	    if (n%r ==(0)){
		return false;}
	r = r + 1;
	}
	return true; 
    }
}
