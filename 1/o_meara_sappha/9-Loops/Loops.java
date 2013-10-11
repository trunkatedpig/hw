import java.io.*;
import java.util.*;


public class Loops {
    int answer;
    
    public int fact(int n) {
	if (n == 0)
	    answer = 1;
	else
	    answer = n * (n - 1);
	return answer;
    }

    public int fact2(int n) {
	answer = 1;
	while (n > 0) {
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }
    
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
