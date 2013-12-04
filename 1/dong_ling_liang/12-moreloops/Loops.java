import java.io.*;
import java.util.*;

public class Loops {
    
    public String diag(int n){
	String ret = "";
	for (int i=1; i<=n; i++){
	    String sp = "";
	    for (int u=i-1; u>0; u-=1){
		sp += " ";
	    }
	    ret += sp + "*" + "\n";
	}
	return ret;
    }
    public String diagWord(String w){
	String ret = "";
	for (int i=0; i<w.length(); i+=1){
	    String sp = "";
	    for (int n=i ; n>0; n= n-1){
		sp += " ";
	    }
	    ret += sp + w.substring(i,i+1) + "\n";
	}
	return ret;
    }
    public String fence(int h, int w){
	if (h<2 || w<2){
	    return "Doesn't fit requirements";
	}
	else {
	    String ret ="";
	    for (int i=0; i<h; i++){
		String in ="";
		for (int x=w-2; x>0; x= x-1){
		    if (i==0 || i==h-1){
			in += "-";
		    }
		    else {
			in += " " ;
		    }}
		if (i==0 || i==h-1){
		    ret += "+" + in + "+\n";
		}
		else {
		    ret += "|" + in + "|\n";
		}
	    }
	    return ret;
	}
    }
}

