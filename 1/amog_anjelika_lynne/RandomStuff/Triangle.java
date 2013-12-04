import java.io.*;
import java.util.*;

public class Triangle {
    public String trianglify(int h, String c){
	String t = new String();
	for (int i = 0; i < h; i = i + 1){
	    for (int r = h - i; r >= 0; r = r - 1)
		t = t + " ";
	    for (int k = i; k >= 0; k = k - 1)
		t = t + c;
	    t = t + "\n";
	}
	return t;
    }

    public String trianglify2(int h, String c){
	String t = new String();
	for (int i = 1; i <= h; i = i + 1){
	    for (int r = h - i; r >= 0; r = r - 1)
		t = t + " ";
	    if (i != 1){
		for (int k = i + i - 1; k > 0; k = k - 1)
		    t = t + c;
	    }
	    else {
		t = t + c;
	    }
	    t = t + "\n";
	}
	return t;
    }
}