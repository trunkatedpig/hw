import java.io.*;
import java.util.*;

public class For{
    public int fact2 (int n) {
	int total;
	for (total = 1; n >= 1; n -= 1) {
	    total = total * n;
	}
	return total;
    }
    public String reverse(String word) {
	int index, length = word.length();
	String returnString = "";
	for (index = length - 1; index >= 0; index -= 1) {
	    returnString = returnString + word.substring(index - 1,index);
	}
	return returnString;
    }
}