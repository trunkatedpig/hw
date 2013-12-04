import java.io.*;
import java.util.*;

public class StringStuff{
    private String word;
    
    public StringStuff(String local){
	word = local;
    }

    public String getWord(){
	return word;
    }

    public String capitalize(String lname){
	int spacelocation;
	String s1,s2,s3,s4;
	spacelocation = lname.indexOf(" ");
	s1 = lname.substring(1,spacelocation+1);
	s2 = lname.substring(spacelocation + 1,spacelocation + 2);
	s2 = s2.toUpperCase();
	s3 = lname.substring(0,1);
	s3 = s3.toUpperCase();
	s4 = lname.substring(spacelocation + 2);
	return s3 + s1 + s2 + s4;
    }

    public String bondify(String lname){
	int spacelocation;
	String s1,s2;
	s1 = capitalize(lname);
	spacelocation = s1.indexOf(" ");
	s2 = s1.substring(0,spacelocation);
	s2 = s2 + ", ";
	return s2 + s1;
    }

    public String pigLatinify(String lword){
	String flet,end,llet;
	flet = lword.substring(0,1);
	end = lword.substring(1);
	llet = lword.substring(lword.length() - 1);
	if (flet == "a" || flet == "e" || flet == "i" || flet == "o" || flet == "u"){
	    if (llet == "a" || llet == "e" || llet == "i" || llet == "o" || llet == "u"){
		return lword + "yay";
	    }
	    else{
		return lword + "ay"; 
	    }
	}
	else{
	    return end + flet + "ay";
	}	
    }
}
