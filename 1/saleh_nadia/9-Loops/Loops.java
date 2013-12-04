import java.io.*;
import java.util.*;

public class Loops {

    public int fact (int n) {
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * fact (n - 1);
	}
    }

    public int fact2 (int n) {
	int ans = 1;
	while (n > 0) {
	    ans = ans * n;
	    n = n - 1;
	}
	return ans;
    }

    public int GCD (int A, int B) {
	int x = 1;
	int result = 1;
	if (A > B) {
	    x = B;
	}
	else {
	    x = A;
	}
	while (x > 0) {
	    if ((A % x == 0) && (B % x == 0)) {
		result = x;
		x = 0;
	    }
	    x = x - 1;
	}
	return result;
    }

    public int GCD2 (int A, int B)  {
	int a=1;
	while (B != 0) {
	    a = A;
	    A = B;
	    B = a % B;
	}
	return A;
    }

    public boolean isPrime (int n) {
	boolean result = true;
	int x = n - 1;
	while (x > 1) {
	    if (n % x == 0) {
		result = false;
		x = 0;
	    }
	    else {
		x = x - 1;
	    }
	}
	return result;
    }

}
