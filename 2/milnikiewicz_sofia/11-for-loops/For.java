import java.io.*;
import java.util.*;

public class For{

    public int fact2(int n){
        int s = 1;
        for ( ; n>0; n=n-1){
            s = s*n;
        }
        return s;
    }

    public String reverse(String s){
        int l,c;
        l = s.length();
        String ans;
        ans = "";
        for (c=0; c<l; c+=1){
            ans = s.substring(c, c+1) + ans;
        }
        return ans;
    }
    
    public String table(int n, int m){
	int c,c2;
	String ans;
	ans = " ";
	for (c2=0; c2<=m; c2 +=1){
	    for (c=1; c<=n; c+=1){
		ans = ans + c;
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
    //table doesn't work :(
}
