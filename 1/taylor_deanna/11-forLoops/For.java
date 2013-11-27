import java.io.*;
import java.util.*;

public class For{
    
    public String isPrime(int x){
	int g = x/2;
	String answer = "True";
	for (int i=g; i>1; i = i-1){
	    if (x%i == 0) {
		answer = "False";
	    }
	}
	return answer;
    }

    public String Reverse(String s){
	int y = s.length();
	String r= "";
	for (int i=y; i>0; i= i -1){
	    r= r + s.substring(i-1, i);
	}
	return r;
    }

    public String table(int n, int m){
	String t = "";
	
	//top line
	for (int i=1; i<=n; i = i+1){
	    t= t + i + " ";
	}
	
	//space
	t= t + "\n";
	
	//next lines
	for (int i=1; i<=m; i = i +1){
	    t = t + i + " ";
	    for (int j=1; j<=n; j = j+1){
		t = t + (i*j) + " ";
	    }
	    t = t+ "\n";
	}
	return t;
    }
}

	    
	
