import java.util.*;
import java.io.*;

public class Rotate {
    
    public String rotLetters (String s, int offSet) {
	String temp = s.toLowerCase();

	for(int i = 0; i < temp.length(); i++) {
	    Char onHold = temp.charAt(i);
	    onHold = onHold + offSet;
	    if (onHold > z) {
		onHold = onHold - z + a;
	    }
	    temp = temp.substring(i, i+1) + valueOf(onHold) + temp.substring(i+2);
	}

	return temp;
    }

}
