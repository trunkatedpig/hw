import java.io.*;
import java.util.*;

public class ForLoop{
    public int gcd(int a, int b){
	int i;
        for (i = a; i > 0; i = i -1){
	    if (a%i == 0 && b%i == 0){
		return i;
	    }
	}
        return i;
    }

    public String reverse(String s){
	String result = "";
	for (int i = s.length(); i > 0; i = i -1){
	    result = result + s.substring(i-1, i);
	}
	return result;
    }

    /* For this next function, i don't understand what a n x m table of products is*/

    
}
