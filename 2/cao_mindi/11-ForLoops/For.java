import java.io.*;
import java.util.*;

public class For{
    int p = 0;
    public For(){
    }
    
    public boolean isPrime(int n){
	int x;
	for (x = 2; x < n; x = x + 1){
	    if (n%x == 0){
		p = 1;
	    }
	return p == 0;
    }
return false;
}
    public String Reverse(String s){
	String result = "";
	int n;
	for (n = 0; n < s.length(); n = n + 1){
	    result = s.substring(n, n + 1) + result;
	}
	return result ; }

    public String table(int n, int m){
	return "alskdfjawo;eijf";
    }
}
