import java.io.*;
import java.util.*;

public class Same {

    public String sameEnds(String string) {
	int start,end;
	String answer;
	answer = "";
	start = 0;
	end = string.length()-1;
	while (start < string.length()/2){
	    if (string.substring(0,start + 1).equals(string.substring(end))){
		answer = string.substring(end);
	    }
	    start = start + 1;
	    end = end - 1;
	}
	return answer;
    }

    public boolean sameStarChar(String str) {
	int index = 1;
	boolean answer = true;
	for (index = 1; index < str.length()-1; index= index+ 1){
	    if (str.substring(index,index+1).equals("*")){
		if (answer == true){
		    if (str.substring(index-1,index).equals(str.substring(index+1,index+2))){
			answer = true;
		    }
		    else {
			answer = false;
		    }
		}
	    }
	}
	return answer;
    }









}
