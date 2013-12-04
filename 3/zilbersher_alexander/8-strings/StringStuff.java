import java.io.*;
import java.util.*;

/*
String s1="Hello World!";
int a = s1.length();    a will be set to 12

System.out.println(s1.substring(6));  Will print out "World!"
                                      remember, we count from 0
				            (goes all the way to end)

System.out.println(s1.substring(6,8));  Will output "Wo" 
                                        (exclusive of 8)

String s2 = s1.toUpperCase(); // s2 <-- "HELLO WORLD!"
String s1.indexOf(" ") will print out location of " " (ie: 5)
*/

public class StringStuff{
    
    public String capitalize(String name){
	String firstcap = name.substring(0,1).toUpperCase();
	String wordA = firstcap + name.substring(1,name.indexOf(" "));
	String secondcap = name.substring((name.indexOf(" ")+1),(name.indexOf(" ")+2)).toUpperCase();
	String wordB = secondcap + name.substring((name.indexOf(" ")+2));
	return wordA + " " + wordB;
    }

    public String bondify(String name){
	String wordA = name.substring(0,name.indexOf(" "));
        String wordB = name.substring(name.indexOf(" ")+1);
	return wordB + " " + wordA + " " + wordB;
    }
    
    public String pigLatinify(String name){
	String firstlet = name.substring(0,1);
	String first2let = name.substring(0,2);
	String rest1 = name.substring(1);
	String rest2 = name.substring(2);
	if (firstlet.indexOf("a") == 0 ||
	    firstlet.indexOf("e") == 0 ||
	    firstlet.indexOf("i") == 0 ||
	    firstlet.indexOf("o") == 0 ||
	    firstlet.indexOf("u") == 0 ||
	    firstlet.indexOf("y") == 0) {
	    return name + "ay";
        } else if (first2let.indexOf("th") == 0 ||
		   first2let.indexOf("sh") == 0 ||
		   first2let.indexOf("ch") == 0) {
	    return rest2 + first2let + "ay";
	} else {
	    return rest1 + firstlet + "ay";
	}
    }
}