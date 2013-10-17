import java.io.*;
import java.util.*;

public class For{
    public For(){
    }
    
    public boolean isPrime(int n){
	int x;
	for (x = n - 1; x >= 1; x = x - 1){
	    if (n%x == 0){
		return x == 1;
	    }
	}
	return x == 1;
    }

    public String Reverse(String s){
	String result = "";
	int n;
	for (n = 0; n < s.length(); n = n + 1){
	    result = s.substring(n, n + 1) + result;
	}
	return result ; }

    public String table(int n, int m){
	//completely incomplete
	return "T.TT";
    }
}
