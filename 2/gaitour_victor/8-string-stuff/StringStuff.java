import java.io.*;
import java.util.*;

public class StringStuff {
    private String a;
    private int space;
    public String Capitalize(String name){
	a=name;
	space=name.indexOf(" ");
	return (a.substring(0,1)).toUpperCase()+a.substring(1,space+1)+a.substring(space+1,space+2).toUpperCase()+a.substring(space+2);
    }
    public String bondify(String name) {
	a=name;
	space=a.indexOf(" ");
	return a.substring(space+1)+","+name;
    }
    public String PigLatinify(String word){
	a=word;
	if (a.substring(0,1).equalsIgnoreCase("a")){
	    a=a+"yay";
	}
	else if (a.substring(0,1).equalsIgnoreCase("e")){
	    a=a+"yay";
	}
	else if (a.substring(0,1).equalsIgnoreCase("i")){
	    a=a+"yay";
	}
	else if (a.substring(0,1).equalsIgnoreCase("o")){
	    a=a+"yay";
	}
	else if (a.substring(0,1).equalsIgnoreCase("u")){
	    a=a+"yay";
	}
	else if (a.substring(0,2).equalsIgnoreCase("ch")){
	    a=a.substring(2)+"chay";
	}
	else if (a.substring(0,2).equalsIgnoreCase("st")){
	    a=a.substring(2)+"stay";
	}
	else if (a.substring(0,2).equalsIgnoreCase("th")){
	    a=a.substring(2)+"thay";
	}
	else if (a.substring(0,2).equalsIgnoreCase("sh")){
	    a=a.substring(2)+"shay";
	}
	else {
	    a=a.substring(1)+a.substring(0,1)+"ay";
	}
	return a;
}
}