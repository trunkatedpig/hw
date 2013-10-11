//Andrew Fischer

import java.io.*;
import java.util.*;

public class loops {
    private int result;
    

    public int fact(int n) {
	if(n == 0){
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n) {
	int result = 1;
	while (n != 0){
	    result = result * n;
	    n = n-1;
	}
    }

    public int GCD(int a, int b) {
	
	private int temp, count = b;
	if (a < b)
	    {   
		b = c;
		a = b;
		c = a;
	    }

	if (a%count != 0 && b&count != 0) {
	    count = count-1;
	}
	else {
	    return count;
	}
    }
	    	    	
}
