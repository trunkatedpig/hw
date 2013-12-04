import java.io.*;
import java.util.*;

public class For{
    public int factorial(int n){
	int f = 1;
	for (int i = n; i > 0; i = i - 1){
	    f = f * i;
	}
	return f;
    }

    public String Reverse(String s){
	String revStr = "";
	for (int i = s.length(); i > 0; i = i - 1){
	    revStr = revStr + s.substring(i-1, i);
	}
	return revStr;
    }

    public String table(int n, int m){
	String complete = "";
	for (int init = 1; init <= n; init = init + 1){
	    complete = complete + init + " ";
	}
	for (int ial = 1; ial <= m; ial = ial + 1){
	    complete = complete + "\n" + ial;
	    for (int i = 1; i <= n; i++){
		complete = complete + (ial*i) + " ";
	    }   
	}
	return complete;
    }
}


