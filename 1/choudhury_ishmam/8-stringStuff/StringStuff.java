import java.io.*;
import java.util.*;

public class StringStuff {
    
    public String capitalize(String name){
	String alpha = name.substring (0,1);
	alpha = alpha.toUpperCase();
	String finalName = alpha;
	int sp = name.indexOf(" ");
	alpha = name.substring(1, sp);
	finalName = finalName + alpha;
	alpha = name.substring(sp, sp+2);
	alpha = alpha.toUpperCase();
	finalName = finalName + alpha;
	alpha = name.substring(sp+2);
	finalName = finalName + alpha;
	return finalName;
    }

    public String bondify(String name){
	name = capitalize(name);
	int sp = name.indexOf(" ");
	String fh = name.substring(0,sp);
	String sh = name.substring(sp+1);
	String fin = sh + ", " + fh  + " " + sh + ".";
	return fin;
    }
}
