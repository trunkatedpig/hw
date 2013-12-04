import java.io.*;
import java.util.*;

public class Loops {

    private int answer;
    private int ld = 2;

    public int fact(int n) {
	answer = 1;
	if (n == 1) {
	    return answer;
	} else {
	    answer = n * fact(n-1);
	}
	return answer;
    }
    
    public int fact2(int n) {
	answer = 1;
	while (n != 1) {
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }


    public int gcd(int a, int b) {
	if (a > b)  
	    answer = b;
	else
	    answer = a;
	while (a%answer != 0 || b%answer != 0) {
	    answer = answer - 1;
	}
	return answer;
    }
    
    public int gcd2(int a, int b) {
	int max = Math.max(a,b);
	int min = Math.min(a,b);
	while (min != 0) {
	     answer = max%min;
	     max = Math.max(answer, min);
	     min = Math.min(answer, min);
	}     
	return max;
    }

    public boolean IsPrime(int n) {
	while (n > ld) {
	    if (n%ld == 0)
		return false;
	    else 
		ld = ld + 1;
	}
	return true;
    }	       
    
    public boolean IsPrimef(int n) {
	for (int l=2;n%l==0;l++) {
	    return false;
	}
	return true;
    }
}

	    
