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
    public String reverse(String word) {
		int index, length = word.length();
		String returnString = "";
		for (index = 0; index < length; index += 1) {
		    returnString = word.substring(index,index + 1) + returnString;
		}
		return returnString;
    }
    public String table(int n,int m) {
    	String returnString = "   ";
    	for (int i = 1; i <= n; i += 1){
    		returnString = returnString + i + "  ";
    	}
    	returnString = returnString + "\n";
    	for (int i = 1; i <= m; i += 1){
    		returnString = returnString + "\n" + i + "  ";
    		for (int j = 1; j <= n; j += 1){
    			returnString = returnString + i*j + "  ";
    		}
    	}
    	return returnString;
    }
}