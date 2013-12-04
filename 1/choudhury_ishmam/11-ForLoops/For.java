import java.io.*;
import java.util.*;

public class For {
		String x;
		String f;
		String p;
		int y;
		int x;
		
	public String Reverse(String s) {
		for (x = s ;  x.length() == 0 ; 
		x = x.substring(x.length() - 1)) { 
			f = ""; 
			p = x.substring( x.length() - 1 , x.length());
			f = f + p;
		}
		return f;
	}
	
	public int fact(int n) {
		
		for (x = n; x < 1; x = x - 1) {
			y = 1;
			y = x * y;
		}
		return y;
	}

	//what is number 3. Mr zamansky pls
	
}