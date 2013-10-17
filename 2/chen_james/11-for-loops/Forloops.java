import java.io.*;
import java.util.*;

public class Forloops {
	
	
	public int fact2 (int n) {
		int ans;
		for( ans = 1; n != 0; n--){
			ans = ans * n;		
			}
		return ans;
	}

	public String reverse (String s) {
		int length = s.length();
		int a;
		String reversed = "";
		for(a = 0; a < length; a += 1) {
			reversed = s.substring(a,a + 1) + reversed;
			}
		return reversed;
		
		}
		
	/* public String table(int a,int b) {
    	String result = "   ";
    	for (int i = 1; i <= a; i += 1){
    		result = result + i + "  ";
    	}
    //stuck	
	}
	*/
	}
	


