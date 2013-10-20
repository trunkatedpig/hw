import java.io.*;
import java.util.*;

public class For{
    public String diag(int n) {
	String stars = new String();
	int count;
	for (count = 0; count < n; count++){
	    stars = stars + "*";
	}
	return diagWord(stars);
    }
    public String diagWord(String word){
	int count;
	String returnStr = "";
	for (count = 0; count < word.length(); count++){
	    for (int i = 0; i < count; i++){
		returnStr = returnStr + " ";
	    }
	    returnStr = returnStr + word.substring(count, count + 1) + "\n";
	}
	return returnStr;
    }
    public String fence(int a, int b) {
	String result = "", topandbottom = "", sides = "";
	int acount, bcount;
	for (acount = 1; acount <= a; acount++){
	    if (acount == 1 || acount == a) {
		topandbottom += "+";
	    }
	    else {
		topandbottom += "-";
	    }
	}
	topandbottom += "\n";
	for (acount = 1; acount <= a; acount++){
	    if (acount == 1 || acount == a) {
		sides += "|";
	    }
	    else {
		sides += " ";
	    }
	}
	sides += "\n";
	for (bcount = 1; bcount <= b; bcount++) {
	    if (bcount == 1 || bcount == b) {
		result += topandbottom;
	    }
	    else {
		result += sides;
	    }
	}
	return result;
    }
}