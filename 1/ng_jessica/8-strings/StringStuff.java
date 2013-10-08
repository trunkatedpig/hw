import java.io.*; 
import java.util.*; 

public class StringStuff {
    
    public String capitalize (String name) {
	int i; 
	i = name.indexOf (" "); 
	int x;
	x = i + 1; 
	String n; 
	n = (name.charAt(0));.toUpperCase(); 
	n = n + name.substring (0, x);
	n = n + (name.charAt(x)).toUpperCase();
	n = n + name.substring (x + 1, (name.length()-1));
	return n; 
    }

    public String bondify (String name) {
	String n; 
	n = capitalize (name); 
	int i; 
	i = name.indexOf (" "); 
	i = i + 1; 
	int l; 
	l = name.length() - 1;
	String y; 
	y = n.substring (i, l) + ", " + n;
	return y; 
    }
}
