import java.io.*;
import java.util.*;

public class For {
    
    //Rewriting with for loop
    public boolean isPrime(int n) {
	for (int numBelow = n - 1; numBelow > 1; numBelow--){
	    if (n%numBelow == 0) {
		return false;
	    }
	}
	return true;
    } 

    public String Reverse(String s) {
	int l;
	String result = "";
	
	for (l = s.length(); l > 0; l--){
	    result = result + s.substring(l-1,l);
	}
	return result;
    }

    //NEED EXPLANATION
    public String table(int n, int m) {
	int i;
	int j;
	String line = "";
	//for (j = 0; j <= n; j++) {
	//  line = line + j + "\t";
	
	for (i = 0; i <= m; i++) {
	    for (j = 0; j <= n; j++) {
		if (i == 0 && j != 0)
		    line = line + j + "\t";
		else if (i != 0 && j == 0)
		    line = line + "\n" + i + "\t";
		else if (i > 0 && j > 0)
		    line = line + " " + i * j + "\t";
	    }
	}
	return line;
    }
}