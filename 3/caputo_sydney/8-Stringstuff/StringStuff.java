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
}

/*indexOf(int ch) 
          Returns the index within this string of the first occurrence of the specified character.


substring(int beginIndex, int endIndex) 
          Returns a new string that is a substring of this string.


toUpperCase() 
Converts all of the characters in this String to upper case using the rules of the default locale.*/







