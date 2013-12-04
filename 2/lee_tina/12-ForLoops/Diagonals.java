//Kelly Chen and Tina Lee

import java.io.*;
import java.util.*;

public class Diagonals{

    public String diag(int n){
	int spaces;
	int rows;
	String result = "";
	for (rows = 1; rows <= n; rows++){
	    for (spaces = 0; spaces < rows; spaces ++){
		result = result + " ";
	    }
	    result = result + "*" + "\n";
	}
	return result;  
    }

    public String diagWord(String w){
	int spaces;
	int rows;
	String result = "";
	for (rows = 1; rows <= (w.length()); rows++){
	    for (spaces = 0; spaces < rows; spaces ++){
		result = result + " ";
	    }
	    result = result + w.substring((rows - 1), rows) + "\n";
	}
	return result;
    }

    public String fence (int h, int w){
	int dashes;
	int spaces;
	int rows;
	String topbot = "+"; //gives +---...---+
	String middle = "";//gives |  ...  |
	for (dashes = 0; dashes <= (w -2); dashes ++){
	    topbot = topbot + "-";
	}
	topbot = topbot + "+";

	for (rows = 1; rows <=h ; rows ++){
	    middle = middle + "|";
	    for (spaces = 0; spaces < (w - 1); spaces ++){	  
		middle = middle + " ";
	    }
	    middle = middle + "|" + "\n";
	    }

	return topbot + "\n" + middle + topbot;
    }
}
