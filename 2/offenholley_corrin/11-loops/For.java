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
	//nested loop time!
	String ans;
	ans="";
	int storage;
	storage = m;
	int nmult;
	int mmult;
	nmult=1;
	mmult=1;
	for (x=1;x != n;x=x+1){
		for (;m != 0;m=m-1){
			ans+=(nmult*mmult);
			mmult+=1;
		}
		m=store;
		mmult=1;
		nmult+=1;
		ans+="\n"
	}
	return ans;
   }
}
