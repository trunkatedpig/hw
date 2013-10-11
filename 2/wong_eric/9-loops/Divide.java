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

	if ( big % small == 0){
	    return small;

	}
	else {
	    return GCD(big, small - 1);
	}
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
	if (n <= 1) {
	    return false;
	}
	else {
	    return  (GCD(n, n-1) == 1);
	}

    }

}
