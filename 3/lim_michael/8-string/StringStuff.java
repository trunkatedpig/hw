import java.io.*;
import java.util.*;

public class StringStuff {
    private int index;
    private String first, last;

    public void getInfo(String name) {
	index = name.indexOf(" ");
	first = name.substring(0,index);
	last = name.substring(index+1);
    }

    public void info() {
	System.out.println(index + " " + first + " " + last);
    }

    public String capitalize(String name) {
	getInfo(name);
	String s1 = first.substring(0,1);
	String s2 = last.substring(0,1);
	String s1n = s1.toUpperCase();
	String s2n = s2.toUpperCase();
	
	String s1t = s1n + first.substring(1);
	String s2t = s2n + last.substring(1);
	String s = s1t + " " + s2t;
	return s;
    }
    
    public String bondify(String name) {
	String name1 = capitalize(name);
	getInfo(name1);
	String bond = last + ", " + first + " " + last;
	return bond;

    }
}
