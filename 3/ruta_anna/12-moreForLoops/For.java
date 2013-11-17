import java.io.*;
import java.util.*;

public class For {

	public String diag(int n) {
		String result = "";
		String space = "";
		for (int i = 0;i<n;i++) {
			if (i == n-1)
				result = result + space + "*";
			else
				result = result + space + "*\n";
			space = space + " ";
			}
		return result;
	}

	public String diagWord(String s) {
		String result = "";
		String space = "";
		for (int i = 0;i<s.length();i++) {
			if (i == s.length()-1)
				result = result + space + s.substring(i);
			else
				result = result + space + s.substring(i,i+1) + "\n";
			space = space + " ";
			}
		return result;
	}

	public String fence(int a, int b) {
		String result = "";
		int j = 0;
		for (int i = 1; i<=a; i++){
			if (i == 1 || i == a) {
				for (j = 1; j<=b; j++){
					if (j == 1 || j == b)
						result = result + "+";
					else
						result = result + "-";
				}
			}
			else {
				for (j = 1; j<=b; j++) {
					if (j == 1 || j == b)
						result = result + "|";
					else
						result = result + " ";
				}
			}
			result = result + "\n";
		}
		return result;
	}

}