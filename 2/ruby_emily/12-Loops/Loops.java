import java.io.*;
import java.util.*;

public class Loops{
    public String diag(int n){
	int i;
	String line,result;
	line="* \n";
	result="*"+"\n";
	for (i=0;i<n-1;i++){
	    line=" " + line;
	    result=result+line;
	}
	return result;

    }
    public String diagWord(String w){
	int i,j;
	String line=new String();
	String result=new String();
	for (i=0;i<w.length();i++){
	    line=w.substring(i,i+1)+"\n";
	    for (j=0;j<i;j++){
		line=" "+line;
	    }
	    result=result+line;
	}
	return result;
    }
    public String fence(int h, int w){
	String base=new String();
	String middle=new String();
	String result=new String();
	int i,j,k;
	if (h>1 && w>1){
	    base="+";
	    for (i=0;i<(w-2);i++){
		base=base+"-";
	    }
	    base=base+"+\n";
	    middle="|";
		for (j=0;j<(w-2);j++){
		    middle=middle+ " ";
		}
	    middle=middle+"|\n";
	    result=base;
	    for (k=0;k<(h-2);k++){
		result=result+middle;
	    }
	    result=result+base;
	    return result;
	}
	else {
	    return "Sorry, try again";
	}
    }
}

