import java.io.*;
import java.util.*;


public class StringStuff{
    private int s;
    private String f,l,first,end;

    public String capitalize(String name){
	s = name.indexOf(" ");
	f = name.substring(0,1).toUpperCase() + name.substring (1,s);
	l = name.substring(s+1,s+2).toUpperCase()+ name.substring (s+2);
	return f + " " + l;
	    }

    public String bondify(String name){
	s = name.indexOf(" ");
	f = name.substring(0,1).toUpperCase() + name.substring (1,s);
	l = name.substring(s+1,s+2).toUpperCase()+ name.substring (s+2);
	return l+ "," +f + " " + l;
	    }

    public String PigLatinify(String word){
	first = word.substring(0,1);
	if (first.equals("a") || first.equals("e") || first.equals("o") || first.equals("u") || first.equals("i")){
	    end = word + "yay";
	}
	else {
	    end = word.substring(1) + first + "ay";
	}
	return end;
    }
}
