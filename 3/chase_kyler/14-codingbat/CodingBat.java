import java.util.*;
import java.io.*;

public class CodingBat {
	public boolean sameStarChar(String str) {
		int i = 1;
		while (i<str.length()-1) {
			if (str.substring(i,i+1).equals("*")) {
				if (str.substring(i-1,i).equals(str.substring(i+1,i+2)))
					i = i + 1;
				else
					return false;
			}
			else
				i = i + 1;
		}
		return true;
	}

	public String sameEnds(String string) {
		String result = "";
		int i = 0;
		int j = string.length() / 2;
		string = string + " ";
		for 
		while (i<j) {
			if (string.substring(i,i+1).equals(string.substring(j,j+1))) {
				result = result + string.substring(i,i+1);
				i++;
				j--;}
			else
				return result;
		}
		return result;
	}
		
			


}
