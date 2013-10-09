import java.io.*; 
import java.util.*; 

public class StringStuff {
    
    public static String capitalize (String name) {
	int i; 
	i = name.indexOf (" "); 
	int x;
	x = i + 1; 
	String n; 
	n = (name.substring(0,1)).toUpperCase(); 
	n = n + name.substring (1, x);
	n = n + (name.substring(x, x + 1)).toUpperCase();
	n = n + name.substring (x + 1, name.length());
	return n; 
    }

    public static String bondify (String name) {
	String n; 
	n = capitalize (name); 
	int i; 
	i = name.indexOf (" "); 
	i = i + 1; 
	int l; 
	l = name.length();
	String y; 
	y = n.substring (i, l) + ", " + n;
	return y; 
    }

    public static String pigLatinify (String word) {
	String vowels = "aeiou"; 
	String first = word.substring (0,1); 
	String value; 
	if (vowels.contains (first)) {
	    value =  word + "yay"; 
	}
	else {
	    value = word.substring(1,word.length()) + first + "ay"; 
	}
	return value; 
    }

}
