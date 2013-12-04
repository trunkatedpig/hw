import java.util.*;
import java.io.*;

public class For {
	
	public int fact(int n) {
		int result;
		result = 1;
		for (;n > 1;n=n-1)
			result = result * n;
		return result;
	}

	public String reverse(String s) {
		int i;
		String result = "";
		for (i = s.length();i>0;i=i-1)
			result = result + s.substring(i-1,i);
		return result;
	}

	public String table(int n, int m) {
		String result = "";
		int i,j;
		for (i=1;i<n+1;i++)
			result = result + i;
		result = result + "\n";
		for (i=1;i<m+1;i++) {
			result = result + i;
			for (j=1;j<n+1;j++)
				result = result + j * i;
			result = result + "\n";
		}
		return result;
	}


}
