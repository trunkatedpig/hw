import java.io.*;
import java.util.*;

public class For{

    public String diag(int i){
        int n;
        String ans;
        ans = "";
        for (n=0; n<i; n=n+1){
            int m;
            for (m=0; m<n; m=m+1){
                ans = ans + " ";
            }
            ans = ans + "*\n";
        }
        return ans;
    }

    public String DiagWord(String s){
        int n;
        int i;
	i = s.length();
        String ans;
        ans = "";
        for (n=0; n<i; n=n+1){
            int m;
            for (m=0; m<n; m=m+1){
                ans = ans + " ";
            }
            ans = ans + s.substring(n,n+1) + "\n";
        }
        return ans;
    }

    public String fence(int h, int w){
	int n,m;
	String ans, spaces;
	ans = "";
	spaces = "                                ";
	for (n=0; n<h; n=n+1){
	    if (n == 0){
		for (m=0; m<w; m=m+1){
		    if (m == 0){
			ans = ans + "+";
		    }
		    else if (m == w-1){
			ans = ans + "+\n";
		    }
		    else
			ans = ans + "-";
		}
	    }
	    else if (n<h-1){
		ans = ans + "|" + spaces.substring(0,w-2) + "|\n";
	    }
	    else if (n==h-1){
		for (m=0; m<w; m=m+1){
		    if (m == 0){
			ans = ans + "+";
		    }
		    else if (m == w-1){
			ans = ans + "+\n";
		    }
		    else{
			ans = ans + "-";
		    }
		}
	    }
	   
	}
	return ans;
    }
    
}
