import java.io.*;
import java.util.*;

public class For{

public int fact(int n){
    if (n <= 1)
	return 1;
    int ans = 1;
    int m;
    for (m = 1; m <= n; m = m+1){
	ans = ans * m;
    }
    return ans;
}

    public String reverse(String s){
	String result;
	result = "";
	int m;
	for (m = s.length()-1; m >= 0; m = m-1){
	    result = result + s.substring(m, m+1);
	}
	return result;
    }

   public String table(int n, int m){
	
	String Nans = "";
	String ans = "";
	for(int x = 1; x <= n; x = x+1){
	    Nans = Nans + x + " ";
	}

	for (int y = 1; y <= m; y = y+1){
	    ans = ans + "\n" + y + " ";

	    for (int x = 1; x <= n; x = x+1){
		ans = ans + x*y + " ";
	    }
	}
	return Nans + "\n" + ans;
    }
}