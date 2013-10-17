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
}
	    
