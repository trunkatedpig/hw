import java.io.*;
import java.util.*;

public class MoreLoops {
    public String diag(int n){
        String ans = "";
        for (int i = 0;i < n;i = i + 1){
            for (int k = i;k > 0;k = k - 1){
                ans = ans + " ";
            }
            ans = ans + "*\n";
        }
        return ans;
    }

    public String diagWord(String s){
        String ans = "";
        for (int i = 0;i < s.length();i = i + 1){
            for (int k = i;k > 0;k = k - 1){
                ans = ans + " ";
            }
            ans = ans + s.substring(i,i + 1) + "\n";
        }
        return ans;
    }

    public String fence(int h, int w){
	String ans = "";
	if (h > 1 && w > 1) {
	    for(int a = 1; a <= h; a = a + 1) {
		    for(int b = 1; b <= w; b = b + 1) {
			if (a == 1 && b == 1)
			    ans = ans + "+";
			else if (a == 1 && b == w)
			    ans = ans + "+\n";
			else if (a == 1)
			    ans = ans + "-";
			else if (a < h && b == 1)
			    ans = ans + "|";
			else if (a < h && b == w)
			    ans = ans + "|\n";
			else if (a < h)
			    ans = ans + " ";
			else if ((a == h) && (b == 1 || b == w))
			    ans = ans + "+";
			else if (a == h)
			    ans = ans + "-";
		    }
	    }
	}
	return ans;
    }
}
