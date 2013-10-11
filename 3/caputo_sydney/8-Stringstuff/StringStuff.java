import java.io.*;
import java.util.*;

public class StringStuff {
    private int indx;
    private String first, last;
   

    public String capitalize (String name){
	indx = name.indexOf(" ");
	first= name.substring(0,1).toUpperCase() + name.substring(1,indx);
	last= name.substring(indx+1,indx+2).toUpperCase() + name.substring(indx+2);
	return first+" "+ last;
	
    }	


     public String bondify (String name){
	 indx= name.indexOf(" ");
	 last= name.substring(indx+1);
	 return last+", "+ name;}
    /*took pig latin froms stone, was my partner; lost my code when i had to make the new git clone*/

    public String pigLatinify(String lword){
	String flet,end,llet;
	flet = lword.substring(0,1);
	end = lword.substring(1);
	llet = lword.substring(lword.length() - 1);
	if (flet == "a" || flet == "e" || flet == "i" || flet == "o" || flet ==          "u"){
	if (llet == "a" || llet == "e" || llet == "i" || 
	    llet == "o" || llet == "u"){
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







