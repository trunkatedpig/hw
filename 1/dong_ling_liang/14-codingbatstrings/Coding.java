import java.io.*;
import java.util.*;

public class Coding{
    public boolean sameStarChar(String str) {
	boolean ans = true;
	for (int i = 0; i < str.length(); i++){
	    if (str.length() == 1){
		if (str.substring(0)=="*"){
		    ans = ans && true;}
		else
		    {ans = ans && false;}
	    }
	    else if (i==str.length()-1){
		ans = ans && true; }
	    else if(str.substring(i,i+1).equals("*")){
		if (i==0)
		    { ans = ans && true;}
		else {
		    String a = str.substring(i-1, i);
		    String b = str.substring(i+1, i+2);
		    if (a.equals(b)){
			ans = ans && true; }
		    else {
			ans = ans && false;}
		}}
	}
	return ans;
    }
    public String sameEnds(String string){
	String s="";
	int x=string.length();
	for (int q=0; q<=x/2; q++) {
	    if (string.substring(0,q).equals(string.substring(x-q,x))) {
		s=string.substring(0,q);
            }
        }
        return s;
    
    }
    public String sameEnds(String string){
	String s="";
	int x=string.length();
	for (int q=0; q<=x/2; q++) {
	    if (string.substring(0,q).equals(string.substring(x-q,x))) {
		s=string.substring(0,q);
            }
        }
        return s;
    
    }
}