import java.util.*;
import java.io.*;

public class For {
    public String reverse(String s) {
        int i;
	String rev = "";
	for (i = s.length() - 1; i >=  0; i = i - 1) {
	    rev = rev + s.substring(i, i + 1);
	}
	return rev;
    }
    public String table(int n, int m) {
	String s = "";
	int i;
	int j;
	int k;
	for (i = 1; i <=  n; i = i + 1) {
	    s = s + Integer.toString(i) + " ";
	}
	s = s + "\n";
	for (i = 1; i <= m; i = i + 1) {
	    for (j = 1; j <= n; j = j + 1) {
		k = i * j;
		s = s + Integer.toString(k) + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    public int factFor (int n) {
	int result = 1;
	int num;
	for (num = n; num > 0; num = num - 1) {
	    result = result * num;
	}
	return result;
    }
}


