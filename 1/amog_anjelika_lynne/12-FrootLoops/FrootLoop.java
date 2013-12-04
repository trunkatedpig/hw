import java.io.*;
import java.util.*;

public class FrootLoop{
    public String diag(int n){
	String asterisk = new String();
	for (int i = 0; i < n; i++){
	    for (int um = i; um >=0; um--){
		asterisk += " ";
	    }
	    asterisk += "*";
	    asterisk += "\n";
	}
	return asterisk;
    }
    
    public String diagWord(String word){
	String diagonal = new String();
	for (int i = 0; i < word.length(); i++){
	    for (int um = i; um >= 0; um--){
		diagonal += " ";
	    }
	    diagonal += word.substring(i, i+1);
	    diagonal += "\n";
	}
	return diagonal;
    }

    public String fence(int h, int w){
	String f = new String();
	if (h == 1 && w == 1)
	    f = "Error. Put integers greater than one for parameters.";
	else {
	    String firstrow = "+";
	    for (int i = w - 2; i > 0; i--){
		firstrow += "-";
	    } 
	    firstrow += "+";
	    f = firstrow + "\n";
	    for (int i = h - 2; i > 0; i--){
		String eachrow = "|";
		for (int a = w-2; a > 0; a--){
		    eachrow += " ";
		}
		eachrow += "|" + "\n";
		f += eachrow;
	    }
	    f += firstrow;
	}
	return f;
    }
}
