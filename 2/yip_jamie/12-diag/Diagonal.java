import java.io.*;
import java.util.*;

public class Diagonal {
    public String diag (int n){
	String result = new String();
	for (int i= 0; n != i ; i++){
	    for (int m = 0; m != i; m++) {
		result = result  + " ";
	    }
	    result = result + "*" + "\n";
	}
	return result; 
    }

    public String diagWord(String w){
	int i = w.length();
	String result = new String();
	for (int j =0; j != i; j++){
	    for (int k  = 0; j != k; k++){
		result = result + " ";
	    }
	    result = result + w.substring(j, j+1) + "\n";
	}
	return result; 
    }


    public String fence(int h, int w){
	int i = 0, j=0;
	String result = "";

	for (i=0 ; j ==0; j++){
	    result = result + "+";
	}
	for (i = 0; j < (w-1) && j != 0; j++){
	    result = result + "-";
	}
	for (i = 0; j == w ; i++){
	    result = result + "+" + "\n";
	}
	return result;
    }
}
