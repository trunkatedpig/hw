import java.io.*;
import java.util.*;

public class For {
    public int GCD (int A, int B) {
        int x = 1;
        int result = 1;
        if (A > B) {
            x = B;
        }
        else {
            x = A;
        }
        for (x = x; x > 0; x = x - 1) {
            if ((A % x == 0) && (B % x == 0)) {
                result = x;
                x = 0;
            }
        }
        return result;
    }

    public void funTest () {
        int i = 100;
        for (i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println(i);
    }

       public String Reverse (String s) {
	String result = "";
	for (int n = (s.length() - 1); n >= 0; n = n - 1) {
	    result = result + s.substring(n,n+1);
	}
	return result;
    }
    
    public String table (int n, int m) {
	String result = " ";
	for (int x = 1; x <= n; x = x + 1) {
	    result = result + " " + x;
	}
	for (int y = 1; y <= m; y = y + 1) {
	    result = result + "\n" + y;
	    for (int q = 1; q <= n; q = q + 1) {
		result = result + " " + (y*q);
	    }
	}
	return result;
    }
}



