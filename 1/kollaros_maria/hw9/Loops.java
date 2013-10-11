import java.io.*;
import java.util.*;

public class Loops{
    public int fact(int n){
	if (n == 0 || n == 1)
	    return 1;
        else 
	    return (n * fact(n-1));
    }

    public int fact2(int n){
	int answer = 1;
	while (n > 1){
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }

    //worked with Sappha for the rest here
    public int GCD(int a, int b) {
	if (a<b) {
	    while (a > 0) {
		if ((b % a) == 0) {
		    return a;
		}
		else
		    a = a - 1;
	    }
	}
	else
	    return GCD(b,a);
    }

    public int GCD2(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else
	    return GCD(b, (a % b));
    }
}
		
		
