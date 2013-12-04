import java.io.*;
import java.util.*;

public class Loops2{
    private int y;
    private int a;
<<<<<<< HEAD
    public int GCDi(int a, int b){
	int counter = 1;
	int result = 0;
	int other = 0;
	if (a > b ) {
	    counter = b;
	    other = a;}
	else 
	    {counter=a;
		other=b;}
	while (other%counter != 0){
	    counter=counter-1;}
	return counter;
    }
	    
=======
>>>>>>> 2c243d1a02df60da84ca681443777a361c914081
    public int GCD(int a,int b){
	int counter = 1;
	int result = 0;
	int other=0;
<<<<<<< HEAD
	if ( a > b){
=======
	if ( a >  b){
>>>>>>> 2c243d1a02df60da84ca681443777a361c914081
	    counter=b;
	    other=a;}
	else
	    {counter = a;
		other=b;}
<<<<<<< HEAD
	if( a % counter==0 && b % counter ==0)
	    {return counter;}
	else
=======
	if( a % counter==0 &&  b % counter ==0)
	    {return counter;}
	else 
>>>>>>> 2c243d1a02df60da84ca681443777a361c914081
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
<<<<<<< HEAD
	return true;
    }
}
=======
      return true;
    }
}

	
>>>>>>> 2c243d1a02df60da84ca681443777a361c914081
