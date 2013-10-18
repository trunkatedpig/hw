import java.io.*;
import java.util.*;

public class For {

// Factorial rewritten

	public int fact3(int n) {
		int ans = 1;
		if (n == 0) {
			return 1;
		} else {
			for(int i = n; i > 0; i--) {
				ans = ans * i;
			}
		}
		return ans;
	}


	public String Reverse(String s) {
		String ans = new String();
		int maxIndex = s.length() - 1;
		for(int i = maxIndex; i >= 0; i--) {
			String chunk = s.substring(i, i + 1);
			ans = ans + chunk;
		}
		return ans;
	}

	public String table(int n, int m) {
		String ans = new String();
		String firstLine = "  ";
		for (int h = 1; h <= n; h++) {
			firstLine = firstLine + h + " ";
		}
		ans = ans + firstLine + "\n";
		for(int j = 1; j <= m; j++) {
			String thisLine = new String();
			thisLine = thisLine + j + " ";
			for (int k = 1; k <= n; k++) {
				int coefficient = j;
				int product = j * k;
				thisLine = thisLine + product + " ";

			}
			thisLine = thisLine + "\n";
			ans = ans + thisLine;
		}
		return ans;
	}
}