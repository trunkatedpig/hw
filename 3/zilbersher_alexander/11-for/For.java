import java.io.*;
import java.util.*;


//if already initialized, can put ; at beginning of for loop
//a++ is a=a+1
//a-- is a=a-1
//result needs to be initialized as "" in order to add result the first time.
public class For {
    public String Reverse(String s) {
	int a = 0;
	String result = "";
	for (;a<s.length();a++) {
	    result=s.substring(a,a+1)+result;
	}
	return result;
    }

    public String table(int n,int m) {
	String result = "";
	for (;m>=0;m--) {
	    if (m>0) {
		String line = "";
		for (int i=1;i<=n;i++) {
		    line = line + " " + i*m;    
		}
		result = "\n" + m + line + result;
		line = "";
	    } else {
		String line = "";
		for (int i=1;i<=n;i++) {
		    line = line + i + " ";
		}
		result = line + result;
	    }
	}
	return result;
    }
}