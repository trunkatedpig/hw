import java.util.*;
import java.io.*;

public class Bat {

    public boolean sameStarChar(String str) {
	for (int i = 0; i < str.length(); i ++) {
	    if (str.substring(i, i+1).equals("*")) {
		if (str.substring(i-1, i).equals(str.substring(i+1,i+2))) {
		    return true;
		}
		else {
		    return false;
		}
	    }
	}
	return false;
    }

    public String sameEnds(String string) {
      String answer = "";
      int a = 0;
      int length = string.length();
      for (int i = length/2; i > 0; i--) {
	  if (string.substring(0,i).equals(string.substring(length-i))) {
	      a=i;
	  }
      }
      answer = string.substring(0,a);
      return answer;
    } 
