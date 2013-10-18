import java.io.*;
import java.util.*;
public class Diag{
    public String diag(int n){
	String answer = "";
	for(int w=0;w<n;w++){
	    for (int z=w;z>0;z--){
		answer = answer + " ";
	    }
	    answer = answer + "*" + "\n";
	}
	return answer;
    }


    public String diagWord(String s){
	String answer = "";
	for(int w=0;w<s.length();w++){
	    for (int z=w;z>0;z--){
		answer = answer + " ";
	    }
	    answer = answer + s.substring(w,w+1) + "\n";
	}
	return answer;
    }


    public String fence(int a,int b){
    }


}