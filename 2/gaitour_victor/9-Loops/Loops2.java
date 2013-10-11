import java.io.*;
import java.util.*;

public class Loops2{
    private int y;
    private int a;
    public int GCD(int a,int b){
	int counter = 1;
	int result = 0;
	int other=0;
	if ( a >  b){
	    counter=b;
	    other=a;}
	else
	    {counter = a;
		other=b;}
	if( a % counter==0 &&  b % counter ==0)
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
	a = i-1;
	while (a>0){
	    if (( i % a) == 0 ){
		return false;
	    }
	    a=a-1;}
      return true;
    }
}

	