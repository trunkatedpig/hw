import java.io.*;
import java.util.*;

public class For {

	public void table(int n,int m) {
	String ans = new String();
	for (int x = 1; x<m; x=x+1) {
		for (int y = 1; y<n; y=y+1) {
			ans = ans + (y*x);
		}
		System.out.println(ans);}
	}


    //factorial written with while loop
    public int fact(int n){
        int ans = 1;
        for(;n > 0; n = n - 1)
            ans = ans * n;
        return ans;
    }

    public String Reverse(String s){
        String ans = "";
        for (int i = s.length();i>0;i=i-1){
            ans = ans + s.substring(i-1,i);
        }
        return ans;
    }
}