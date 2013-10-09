import java.io.*;
import java.util.*;

    public class Strings {
	
	private String vowels="aeiou";

        String Capitalize(String name){
	    int space = name.indexOf(" ");
	    String s = name.substring(0,space);
	    String s1 = name.substring(space+1);
	    s = s.substring(0,1).toUpperCase() + s.substring(1);
	    s1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
	    return s + " " + s1;
	}

	String bondify(String name){
	    String fixed = Capitalize(name);
	    int space = fixed.indexOf(" ");
	    String last = fixed.substring(space+1);
	    return last + "," + fixed;
	}
    
	String PigLatinify(String name){
	if (vowels.contains(name.substring(0,1))){
	    return name + "yay";
	}
	else if (vowels.contains(name.substring(1,2))){
	    return name.substring(1) + name.substring(0,1) + "ay";
	}
	else {
	    return PigLatinify(name.substring(1)+name.substring(0,1));
	}	   

	}
    }
