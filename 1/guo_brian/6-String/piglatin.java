import java.io.*;
import java.util.*;

public class piglatin {

    public String latinize (String a) {
	String result;
	if (a.substring(0,1) != "a" || a.substring(0,1) != "e" || a.substring(0,1) != "o" || a.substring(0,1) != "o" || a.substring(0,1) != "u"){
	    String a2 = a.substring (1);
	    result = a2 + a.charAt(0) + "ay";
	}
	else {
	    String a2 = a.substring (2);
	    result = a2 + a.substring(0,2) + "ay";
	}
	return result;
    }

}