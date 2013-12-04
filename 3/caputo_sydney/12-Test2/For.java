import java.util.*;
import java.io.*;

public class For{
    public String diag(int n){
	int i;
	int spaces;
	String answer="";
	for (i=0; i<=n; i++){
	    for(spaces=0; spaces<i; spaces++){
		answer=answer+" ";
	    }
	    answer= answer+"*";
	    answer= answer+"\n";
	}
	return answer;}
  
    public String diagword(String n){
	int i;
	String result="";
	int space;
	int l= n.length();
	for (i=0; i != l; i++){
	    for (space= 0; space < i; space++){
		result= result+" ";
	    }
	    result= result + n.substring(i, i + 1)+ "\n";
	}
	return result;
    }
    public String multiply(String s, int i) {
	String result = "";
	for (;i>0;i--)
	    result = result + s;
	return result;
    }
    public String fence(int y, int x) {
	if ( x < 2 || y < 2)
	    return "";
	String result = "+" + multiply("-",x-2) + "+\n";
	for (y = y - 2;y>0;y--)
	    result = result + "|" + multiply(" ",x-2) + "|\n";
	result = result + "+" + multiply("-",x-2) + "+";
	return result;
    }}