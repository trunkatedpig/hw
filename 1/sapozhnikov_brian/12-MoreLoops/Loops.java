import java.io.*;
import java.util.*;

public class Loops {
    public String diag(int n){
	String ans = "";
	int i = 0;
	for (;i<n;i++){
	    for (int k = i;k>0;k--){
		ans = ans + " ";
	    }
	    ans = ans + "*\n";
	}
	return ans;
    }

    public String diagWord(String s){
	String ans = "";
	int i = 0;
	for (;i<s.length();i++){
	    for (int k = i;k>0;k--){
		ans = ans + " ";
	    }
	    ans = ans + s.substring(i,i+1) + "\n";
	}
	return ans;
    }

    public String fence(int h, int w){

    }
}