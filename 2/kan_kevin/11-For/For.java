import java.io.*;
import java.util.*;

public class For{
    public int fact2 (int n) {
        int total;
        for (total = 1; n >= 1; n -= 1) {
            total = total * n;
        }
        return total;
    }
    public String reverse (String word) {
	String result = "";
	for (int i = word.length(); i > 0; i -= 1) {
	    result += word.substring(i-1, i);
	}
	return result;
    }
    public String table (int n, int m){
	String result= "  ";
	for (int i = 1; i <= n; i += 1){
	    result += i + " ";
	}
	result += "\n";
	for (int j = 1; j <= m; j += 1){
	    result += j + " ";
	    for (int k = 1; k <= n; k += 1){
		result += (j * k) + " ";
	    }
	    result += "\n";
	}
	return result;
    }
}
