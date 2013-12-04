import java.util.*;
import java.io.*;

public class MoarFor {
	
	public String multiply(String s, int i) {
		String result = "";
		for (;i>0;i--)
			result = result + s;
		return result;
	}

	public String diag(int n) {
		int i = 0;
		String result = "";
		for (;i<n;i++)
			result = result + multiply(" ",i) + "*\n";
		return result;
	}

	public String diagString(String s) {
		int n = s.length();
		String result = "";
		for (int i = 0;i<n;i++)
			result = result + multiply(" ",i) + s.substring(i,i+1) + "\n";
		return result;
	}

	public String fence(int y, int x) {
		if ( x < 2 || y < 2)
			return "";
		String result = "+" + multiply("-",x-2) + "+\n";
		for (y = y - 2;y>0;y--)
			result = result + "|" + multiply(" ",x-2) + "|\n";
		result = result + "+" + multiply("-",x-2) + "+";
		return result;
	}
}
		
			
