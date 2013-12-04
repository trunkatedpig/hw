import java.io.*;
import java.util.*;

public class For {
    public int gcd(int a, int b){
	int result = b;
	if (b > a){
	    result = a;
	    a = b;
	    b = result;
	}
	for(;a%result != 0 || b%result !=0;result--);
	return result;
    }
    public String Reverse(String s){
	String result = "";
	for(int temp = s.length();temp > 0;temp--){
	    String last = Character.toString(s.charAt(temp - 1));
	    result = result + last;
	    }
	return result;
	}
    public String table(int n, int m){
	String result = "";
	for(int temp = 1; temp <= n; temp++){
	    result = result + temp + " ";
	}
	result = result + "\n";
	for(int temp = 1; temp <= m; temp++){
	    result = result + temp + " ";
	    for (int i = 1; i <= n; i++){
		result = result + temp * i + " ";
	    }
	    result = result + "\n";
	}
	return result;
    }
	    
    }
