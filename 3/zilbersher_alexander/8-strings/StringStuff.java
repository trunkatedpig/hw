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
	return name.substring(0,1).toUpperCase() 
	    + name.substring(1,name.indexOf(" ")) + " " 
	    + name.substring((name.indexOf(" ")+1),(name.indexOf(" ")+2)).toUpperCase() 
	    + name.substring((name.indexOf(" ")+2));
    }

    public String bondify(String name){
	String a = name.substring(0,name.indexOf(" "));
        String b = name.substring(name.indexOf(" ")+1);
	return b + " " + a + " " + b;
    }

}