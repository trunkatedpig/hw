import java.io.*;
import java.util.*;

public class Diag{
    public String diag(int n){
	String result = "";
	for (int i = 0; i < n; i++){
	    for (int j = i; j > 0; j--){
		result += " ";
	    }
	    result += "*\n";
	}
	return result;
    }

    public String diagWord(String w){
	String result = "";
	for (int i = 0; i < w.length(); i++){
	    for (int j= i; j>0; j--){
		result += " ";
	    }
	    result += w.substring(i, i+1) + "\n";
	}
	return result;
    }
    public String fence(int h, int w){
	String result= "";
	result += "+";
	for (int i= w - 2; i>0; i--){
	    result += "-";
	}
	result += "+\n";

	for (int j= h-2; j>0; j--){
	    result += "|";
	    for (int k = w - 2; k>0; k--){
		result += " ";
	    }
	    result += "|\n";}

	result += "+";
	for (int i= w - 2; i>0; i--){
	    result += "-";
	}
	result += "+";

	return result;
    }
}
