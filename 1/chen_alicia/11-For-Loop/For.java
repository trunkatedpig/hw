import java.io.*;
import java.util.*;

public class For{
    //factorial using for
    public int factFor( int n){
	int result = 1;
	for (int b = n; b >0; b = b-1){
	    result = result * b;
	}
	return result;
    }
    
    public String Reverse(String s){
	String result = "";
	for (int a=(s.length()-1);a>=0;a = a-1) {
	    result = result + s.substring(a,a+1);
	}
	return result;
    }
    
    public String table (int n, int m) {
	String result = "";
	for (int a = 1; a <= n; a = a + 1){
	    result = result   + a+ " ";
	}
	for (int b = 1;b <= m; b = b +1){
	    result = result + "\n" + b;
	    for (int c = 1; c <= n; c = c +1){  //c is the a
		result = result + " " + (b * c);
	    }
	}
	return result;
    }
   public String diag(int n){
        String result = "";
        for (int i = 0; i < n; i = i + 1){
            for (int j= i; j > 0; j = j -1){
                result = result + " ";
            }
            result = result + "*" + "\n";   

        }
        return result;
    }
    public String diagWord(String s){
        String result = "";
        for (int i = 0; i < s.length(); i = i + 1){
            for (int j= i; j > 0; j = j -1){
                result = result + " ";
            }
            result = result + s.substring(i,i+1) + "\n";   

        }
        return result;
    }
    
    public String fence(int h, int w) {
	String result = "";
	for (int i = h; i > 0; i = i -1){
	    if(i==h|| i==1){
		result = result + "+";
		for (int j = w-1; j > 0; j = j-1){
		    if (j == 1){
			result = result + "+";
		    }
		    else result = result + "-";
		}
		result = result + "\n";
	    }
	    else {
		result = result + "|";
		for (int j=w-1; j >0; j = j-1){
		    if (j==1){
			result = result + "|";
		    }
		    else {
			result = result + " ";
		    }
		}
		result = result + "\n";
	    }
	}
		
		
	return result;
    }
	    


}
	    
