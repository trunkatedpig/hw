import java.io.*;
import java.util.*;

public class Rot13 {
    public String rot (String s, int num) {
	String low = s.toLowerCase();
	String temp = "";

	System.out.println( low.charAt(1) > 'p');

	for (int i = 0; i < low.length(); i++) {
	    if (low.charAt(i) < 'a' || low.charAt (i) > 'z') { //handles non-characters
		temp = temp + low.charAt(i);
	    }
	    else {
		if (low.charAt(i) + num <= 'z') {
		    temp = temp + (char)(low.charAt(i) + num); //handles all the letters that are still in bound after the rotation
		}
		else {
		    temp = temp + (char)('a' + (num - ('z' +1 - low.charAt(i)))); //handles cases when the letter exceeds "z" after the rotation
		}
	    }
	}
	return temp;
    }
}
