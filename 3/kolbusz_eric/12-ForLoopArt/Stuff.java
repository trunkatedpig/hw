import java.io.*;
import java.util.*;

public class Stuff {
    
    public String mult(String s, int n) {
	String returnstring  = "";
	for (; n > 0; n--) {
	    returnstring = returnstring + s;}
	return returnstring;
    }


    
    public String diag(int n) {
	String returnstring = "";
	for (int i = 1; i<=n; i++) {
	    returnstring = returnstring + mult(" ",i-1) + "*" + mult(" ",n-i) + "\n";}
	return returnstring;
    }

    public String diagWord(String s) {
	String returnstring = "";
	int n = s.length();
	s = s + " ";
	for (int i = 0; i<=n; i++) {
	    returnstring = returnstring + mult(" ",i) + s.substring(i,i+1) + mult(" ",n-i) + "\n";}
	return returnstring;
    }	

    public String fence(int vert, int hor) {
	String returnstring = "";
	if ((vert >= 2) && (hor >= 2)) {
	    String topbottom = "+" + mult("-",hor-2) + "+";
	    returnstring = returnstring + topbottom + "\n";
	    for (int i = 2; i < vert; i++) {
		returnstring = returnstring + "|" + mult(" ",hor-2) + "|" + "\n";}
	    returnstring = returnstring + topbottom;
	}
	return returnstring;
    }
}
