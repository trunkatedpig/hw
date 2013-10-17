import java.util.*;
import java.io.*;

public class Loops{
    public String diag(int n){
	String s = "";
	for(int x = 0; x < n; x++){
	    for(int y = 0; y < x; y++){
		s = s + " ";
	    }
	    s = s + "*";
	    s = s + "\n";
	}
	return s;
    }

    public String word(String n){
	String s = "";
	for (int x = 0; x < n.length(); x++){
	    for (int y = 0; y < x; y++){
		s = s + " ";
	    }
	    s = s + (n.substring(x,x+1));
	    s = s + "\n";
	}
	return s;
    }

    public String fence(int h, int w){
	String s = "";
	if (h < 2 || w < 2){
	    s = "Height/width too low";
	}
	else {
	    for (int x=1; x <= h; x++){
		if ((x == 1) || (x == h)){
		    for (int y=1; y<=w; y++){
			if ((y == 1) || (y == w))
			    s = s + "+";
			else
			    s = s + "-";
		    }
		}
		else {
		    for (int y = 1; y<=w; y++){
			if ((y == 1) || (y == w))
			    s = s + "|";
			else
			    s = s + " ";
		    }
		}
		s = s + "\n";
	    }
	}
	return s;
    }
}
