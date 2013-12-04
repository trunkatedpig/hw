import java.util.*;
import java.io.*;

public class Diag {
	
	
	//Why can't Java multiply strings like Python?!
	
	
	public static String clone(String s, int n) {
		String result = "";
		for (int i=n; i>0; i--) {
			result = result + s;
		}
		return result;
	}
	
	public static String diag(int n) {
		String result = "";
		for (int i=0; i<n; i++) {
			result = result + clone(" ", i) + "*" + "\n";
		}
		return result;
	}
	
	public static String diagWord(String w) {
		String result = "";
		for (int i=0; i<=w.length()-1; i++) {
			result = result + clone(" ", i) + w.substring(i, i+1) + "\n";
		}
		return result;
	}
	
	public static String fence(int h, int w) {
		String base = "+" + clone("-", w-2)+ "+" + "\n";
		String body = "|" + clone(" ", w-2)+ "|" + "\n";
		
		if (w<1 || h<1) {
			return "";
		}
		if (w == 1) {
			base = "+\n";
			body = "|\n";
		}
		if (h == 1) {
			return base;
		}
		if (h == 2 || w == 1) {
			return base + base;
		}
		
		return base + clone(body, h-2) + base;
	}
	
}