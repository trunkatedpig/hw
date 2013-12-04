import java.io.*;
import java.util.*;

public class Pictures{
    
    public String addSpaces(int n){
	String result = "";
	for (int i = n; i>0; i = i -1){
	    result = result + " ";
	}
	return result;
    }

    public String diag(int n){
	String result = "";
	for(int i = 0; i<n; i = i +1){
	    result = result + addSpaces(i) + "*" +" \n";
	}
	return result;
    }

    public String diagWord(String w){
	String result = "";
	for (int i = 0; i < w.length(); i = i +1){
	    result = result + addSpaces(i) + w.substring(i, i+1) + "\n";
	}
	return result;
    }

    public String fence(int b, int h){
	int base = b;
	int height = h;
	String result = "";

	String firstlast = "+";
	for (int i = 0; i < base -2; i = i + 1){
	    firstlast = firstlast + "-";
	}
	firstlast = firstlast + "+";
        
	String row = "|" + addSpaces(base-2) + "|";
	String middle = "\n";
	for (int i = 0; i < height -2; i = i +1){
	    middle = middle + row + "\n";
	}
	
	result = firstlast + middle + firstlast;
	return result;
    }
        
}
