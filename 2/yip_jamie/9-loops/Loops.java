import java.io.*;
import java.util.*;

public class Loops{
    private int result;

    public int fact(int n){
	if (n == 1){
	    return 1;
	} else
	    { 
		return n * fact(n-1);
	    }
    }

    public int fact2(int n){
	result = 1;
	while (n >= 1){
	    result = result * n;    
	    n = n-1;
	}
	return result;
    }

    public int GCD(int a, int b){
	if (a >= b){
	    if (a%b == 0) {
		return b;
	    } else {
		GCD(a, (b-1));
	    }}

	    else {
		if (b%a == 0) {
		return a;
		} else {GCD((a-1), b);
		}
	    }
	}
}