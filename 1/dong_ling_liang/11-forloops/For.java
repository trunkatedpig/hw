import java.io.*;
import java.util.*;

public class For {
    
    public int GCD(int a, int b){
	if (b>a){
	    int temp = a;
	    a = b;
	    b = temp;
	}
	int ans = 1;
	for (int i = a; i>1; i-=1){
	    if (a%i==0 && b%i==0){
		ans = i;
	    }
	}
	return ans;
    }
	 
    public void Reverse1(String s){
	for (int i=0; i<s.length(); i+=1){
	    System.out.print(s.substring(i));
	}
    }
    public String Reverse(String s){
	String ret = new String();
	ret = "";
	for (int i=s.length()-1; i>=0; i-=1){
	    ret += s.substring(i, i+1);
	}
	return ret;
	    }
    public String table(int n, int m){
	String ret="";
	for (int i = 1; i<=m; i+=1){
	    String temp="";
	    for (int u =i; u <=n*i; u+=i){
		temp+=u;
	    }
	    ret += "\n" + temp;
		}
	return ret;
    }
}


