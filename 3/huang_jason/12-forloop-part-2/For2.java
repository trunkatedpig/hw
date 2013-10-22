import java.io.*;
import java.util.*;

public class For2{

    public String diag(int n){
	String ans = "";
	for(int i = 0; i < n; i = i+1){
	    ans = ans + "*" + "\n";
	    for(int j = 0; j < i+1; j = j+1){
		ans = ans + " ";
	    }
	}
	return ans;
    }

    public String diagWord(String w){
	String ans = "";
	for(int i = 0; i < w.length(); i = i+1){
	    ans = ans + w.substring(i,i+1) + "\n";
	    for(int j = 0; j < i+1; j = j+1){
		ans = ans + " ";
	    }
	}
	return ans;
    }

    public String fence(int h, int w){
	String row = "";
	String fullrow = "";
	String side = "";
	String allsides = "";

	for(int i = 0; i < w-2; i = i+1){
	    row = row + "-";
	}
	
	fullrow = "+" + row + "+";

	for(int j = 0; j < w-2; j = j+1){
	    side = side + " ";
	}

	for (int k = 0; k < h-2; k = k+1){
	    allsides = allsides + "|" + side + "|" + "\n";
	}

	return fullrow + "\n"  + allsides + fullrow;
    }
}