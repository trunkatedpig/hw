import java.io.*;
import java.util.*;
/*Worked with Victor Gaitour*/
public class Diag{
    private int i,j;
    public String diag (int n){
	String result="";
	for (i =0 ; i < n; i=i+1){
	    j=i;
	    while (j>0) {
		result= result + " ";
		j=j-1;
	    }
	    result=result + "*"+ "\n";
	
	}
	return result;
    }
    public String diagWord(String w){
	String result="";
	for (i =0 ; i < w.length(); i ++){
	    j=i;
	    while (j>0) {
		result= result + " ";
		j=j-1;
	    }
	    result=result + w.substring(i,i+1)+ "\n";
	}
	return result;
    }

    public String fence (int a, int b){
	String result = "";
	result = result + "+";
	i=a-2;
	while (i>0){
	    result=result+"-";
	    i=i-1;
	}
	result=result+"+"+ "\n";
	j=b-2;
	while (j>0){
	    result = result + "|";
	    j=j-1;
	    i=a-2;
	    while (i>0){
		result=result+ " ";
		i=i-1;
	    }
	    result=result+"|\n";
	}
	result = result + "+";
	i=a-2;
	while (i>0){
	    result=result+"-";
	    i=i-1;
	}
	result=result+"+"+ "\n";
	return result;
    }
}
