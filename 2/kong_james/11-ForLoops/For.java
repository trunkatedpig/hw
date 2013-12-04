import java.io.*;
import java.util.*;

public class For {
    /*Original code for Factorial(using while)*/
    public int fact2(int n){
	int end = 1;
	while ( n >= 1){
	    end = end * n;
	    n = n - 1;
	}
	return end;
 }
    /*Code for Factorial using For*/
    public int fact3(int n){
	int end;
	for (end = 1;n >=1; n=n-1){
	    end = end *n;
	}
	return end;
    }
    
    public String Reverse(String s){
        String result = " ";
	int i;
	int j;
	for (i= s.length(), j = s.length() -1;i > 0;i= i-1, j=j-1){
	    result = result + s.substring(j,i);
	}
	return result;
    }

    public String table(int n,int m){
	String result= " ";
	int i;
	int j;
	for (i = n-1; i>= 0; i =i-1){
		result = result + (n-i) + " ";
	    }
		 result = result + "\n";
	     	 
	for (m= m, j = 1; m > 0;m = m- 1, j= j+1)
	    {
		result = result + j + " ";
		for (i= n - 1;i>=0;i= i-1){
		    result = result + ((n-i)*j) + " ";
		}
		result = result + "\n";
	    }
	return result;
    }

}
