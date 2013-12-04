import java.io.*;
import java.util.*;

public class For{
    

    public int fact2(int n) {
	int result = 1;
	for (int i = 1; i <= n; i++) {
	    result = result * i;
	}
	return result;
    }
    
    public String Reverse (String s) {
	String result = new String();
	for (int i = (s.length() - 1); i >= 0; i = i - 1) {
	    result = result + "" + s.substring(i,i+1);
	}
	return result;
    }
    
    public String table(int n, int m) {
	String result = new String();
	for (int i = 1; i <= n; i ++) {
	    result = result + "" + i + " ";
	}
	result = result + "\n";
	for (int j = 1; j <= m; j++) {
	    result = result + "" + j + " ";
	    for (int k = 1; k <=n; k++) {
		result = result + "" + k*j + " ";
	    }
	    result = result + "\n";
	}
	return result;
    }
}


