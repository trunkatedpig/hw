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
}
