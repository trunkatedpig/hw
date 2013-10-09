import java.util.*;
import java.io.*;


public class Factorial {
    public int fact(int n){
	if (n==1|| n == 0){
	    return 1;}
	else {
	    return n * fact(n-1);}

}

    public int fact2(int n){
	int returnval= 1;
	if ( n == 0){
	    return returnval;
	}
	else {
	    while (n >= 1){
		returnval = returnval * n;
		n = n-1;

	    }

	}
	return returnval;
    }







} 
