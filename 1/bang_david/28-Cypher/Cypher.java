import java.io.*;
import java.util.*;

public class Cypher {
    public String encode (String string, int offset) {
	String preencoded = string.toLowerCase();
	if (offset == 26 || offset ==0) {
	    return preencoded;
	}
	String encoded = "";
	for (int i = 0; i < preencoded.length  () ; i ++) {
	    char a = preencoded.charAt (i);
	    if ( a + offset > 'z') {
		a = (char)( a + offset -  26);
	    }
	    else if (a + offset < 'a') {
		a = (char) ( a +  offset +  26);
	    }
	    else {
		a =(char) (a + offset);
	    }
	    encoded = encoded +  a ;
	}
	return encoded;
    }
}
