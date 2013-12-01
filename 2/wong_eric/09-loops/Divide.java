import java.io.*;
import java.util.*;

public class Divide {
  
    private int small, big;   

    public void smallBig(int a, int b) {
	if (a > b) {
	    big = a;
	    small = b;
	}
	else {
	    big = a;
	    small = b;
	}
    }
   
    public int GCD(int a, int b) {
	smallBig(a, b);

	while (big % small != 0) {
	    small = small - 1;
	}
	return small;
    }

    public int GCD2(int a, int b) {
	smallBig(a, b);
	int r;

	while (small != 0) {
	    r = small;
	    small = big % small;
	    big = r;
	} 
	return big;
    }
    
    public boolean isPrime(int n) {
	int num = n-1;
	while (n % num != 0) {
	    num = num-1;
	}
	if (n > 1) {
	    return (num == 1);
	}
	else {
	    return false;
	}
    }

    //rewriting GCD using for loop
    public int GCDfor(int a, int b) {
	smallBig(a, b);
	for( ; big%small != 0; small --) {
	}
	return small;
    }

    public string reverse(String s) {
	for (int index = s.length() - 1; index >= 0; 
    }
}
