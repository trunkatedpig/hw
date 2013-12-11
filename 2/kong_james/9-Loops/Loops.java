import java.io.*;
import java.util.*;

public class Loops {
    private int y;
    private int a;
    public int fact(int n){
	if (n >= 1){
	    return n;
		}
	else {
	    return n * fact(n-1);
	}
    }
    public int fact2(int n){
	int end = 1;
	while ( n >= 1){
	    end = end * n;
	    n = n - 1;
	}
	return end;
    }
    public int GCD(int a,int b){
	int counter;
	int result;
	int other;
	if ( a >  b){
	    counter=b;
	    other=a;}
	else
	    {counter = a;
	     other=b;}
	if( a%counter==0 &&  b%counter ==0)
	    {return counter;}
	else 
	    {return GCD(counter-1,other);}
    }
    public int GCD2(int a, int b){
	while (b>0){
	   y=a%b;
	   a=b; 
	   b=y;
	}
	return a;
    }
    public boolean isPrime(int i){
	int j;
	for (j=i-1;i%j!=0;j=j-1)
	    if (j ==1)
		return true;
	    else return false;
	return true;
    }
}

