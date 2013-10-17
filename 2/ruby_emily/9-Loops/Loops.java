import java.io.*;
import java.util.*;

public class Loops{

    public int Fact(int n){
	if (n<=1)
	    return 1;
	else
	    return n * Fact(n-1);

    }
    public int Fact2(int n){
	int result=1;
	while (n!=0){
	    result= result * n;
	    n=n-1;
	}
	return result;
    }
    public int gcd(int a,int b){
	int BigNum,LilNum,i;
	if (a<b){
	    BigNum=a;
	    LilNum=b;
	}
	else {
	    BigNum=b;
	    LilNum=a;
	}
	i = LilNum;
	while ((LilNum % i) != 0 || (BigNum % i) != 0) {
		    i = i - 1;
	}
	return i;		
    }
    public int gcd2 (int a, int b) {
	while (b != 0) {
	    int r = a % b;
	    return gcd2 (b, r);
	}
	return a;
    }
    public boolean isPrime(int n) {
	int i = n - 1;
	while (i > 1) {
	    if ((n % i) == 0) {
		return false;
	    }
	    else {
		i = i - 1;
	    }
	}
	return true;
    }
    
}

/*Aida was my class partner*/
