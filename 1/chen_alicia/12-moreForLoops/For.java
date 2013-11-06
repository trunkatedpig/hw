import java.io.*;
import java.util.*;

public class For{
     public String diag(int n){
        String result = "";
        for (int i = 0; i < n; i = i + 1){
            for (int j= i; j > 0; j = j -1){
                result = result + " ";
            }
            result = result + "*" + "\n";   

        }
        return result;
    }


    public String diagWord(String s){
        String result = "";
        for (int i = 0; i < s.length(); i = i + 1){
            for (int j= i; j > 0; j = j -1){
                result = result + " ";
            }
            result = result + s.substring(i,i+1) + "\n";   

        }
        return result;
    }

    public String fence(int h, int w) {
	String result = "";
	for (int i = h; i > 0; i = i -1){
	    if(i==h|| i==1){
		result = result + "+";
		for (int j = w-1; j > 0; j = j-1){
		    if (j == 1){
			result = result + "+";
		    }
		    else result = result + "-";
		}
		result = result + "\n";
	    }
	    else {
		result = result + "|";
		for (int j=w-1; j >0; j = j-1){
		    if (j==1){
			result = result + "|";
		    }
		    else {
			result = result + " ";
		    }
		}
		result = result + "\n";
	    }
	}
		
		
	return result;
    }
	    
}
