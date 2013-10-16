import java.io.*;
import java.util.*;

public class For {
    //factorial written with while loop
    public int fact(int n){
	int ans = 1;
	for(;n > 0; n = n - 1)
	    ans = ans * n;
	return ans;
    }

    public String Reverse(String s){
	String ans = "";
	for (int i = s.length();i>0;i=i-1){
	    ans = ans + s.substring(i-1,i);
	}
	return ans;
    }

    public String table(int n, int m){
	String ans = " ";
	for (int a = 0;a<=m;a=a+1){
	    for (int b = 0;b<=n;b=b+1){
		if (a == 0 & b != 0)
		    ans = ans + " " + b;
		else if (a != 0 & b == 0)
		    ans = ans + "\n" + a;
		else if (a>0 & b>0)
		    ans = ans + " " + a*b;
	    }
	}
	return ans;
    }
}
