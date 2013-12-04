import java.io.*;
import java.util.*;
public class For{
     public boolean isPrime(int n){
	 for (int q=2;q<n;q++){
	     if (n%q == 0)
		 return false;
	 }
	 return true;
    }
    public String Reverse(String s){
	String r = "";
	for (int i = s.length()-1;i>=0;i--){
	    r = r + s.substring(i,i+1);
	}
	return r;
    }
    public String table(int n, int m){
	String r = "";
	for (int j=1;j<=n;j++){
	    r += j + " ";
	}
	r += "\n";
	for (int x=1;x<=m;x++){
	    r += x + " ";
	    for (int y=1;y<=n;y++){
		r += y * x + " ";
	    }
	    r += "\n";
	}
	return r;
    }
}
