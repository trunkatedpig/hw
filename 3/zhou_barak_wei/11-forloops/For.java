import java.io.*;
import java.util.*;

public class For {
	
	//factorial
	public static int fact(int n) {
		if (n == 0) return 1;
		int result = 1;
		for (int i=1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static String Reverse(String s) {
		String result = "";
		for (int i=s.length()-1; i>=0; i--) {
			result = result + s.substring(i, i+1);
		}
		return result;
	}
	
	public static String table(int n, int m) {
		String result = "";
		for (int i = 1; i<=m; i++) {
			for (int j = 1; j <= n; j++) {
				result = result + (j * i) + " ";
			}
			result = result + "\n";
		}
		return result;
	}
	
}