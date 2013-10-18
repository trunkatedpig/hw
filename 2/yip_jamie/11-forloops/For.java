import java.io.*;
import java.util.*;

public class For {

    public int fact2 (int n){
	int f = 1;
        for (f = 1; n >= 1; n = n--){
            f = n * f;
        }
        return f;
    }

    public String reverse(String s) {
	String gnirts = new String();
	for (int l = 0; 1 != s.length(); l ++){
	    gnirts = s.substring(1, 1+1) + gnirts;
	}
	return gnirts;
    }

    public String table (int n, int m){
	int i,j;
	String line = "\t";
	for (i = 1 ; i <= n; i ++){
	    line = line + i + "\t";
	}
	for (j = 1; j<=m; j ++){
	    line = line + "\n" + j + "\t";
	    for (i = 1; i<=n; i ++){
		line = line + i*j + "\t";
	    }
	}
	return line;
    }
}
