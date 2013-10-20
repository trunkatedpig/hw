import java.util.*;
import java.io.*;

public class Moreloops{

    public String Diagonal(int x){

	String fin = "";
	String spaces = "";
	for (int n = 1; n <= x; n ++){
	    spaces = spaces + " ";
	    fin = fin + "\n"  + spaces + "*";
	}
	return fin;
    }
    
    public String Diagonalword(String x){

	String fin = "";
	String spaces = "";
	String letter = "";
	for (int n = 1; n <= (x.length()); n ++){
	    letter = x.substring(n -1, n);
	    spaces = spaces + " ";
	    fin = (fin + "\n" + spaces + letter);
	}
	return fin;
    }


    // Why is this code not working? It thinks & thinks forever!
    public String Fence(int h, int w){

	String spaces = "";		
	String topfence = "";
	String fin = "";
	String top = "";
	if (h < 2 || w < 2){
	    fin = "fence method: Input value too small";
	}
	
	else {
	    
	    for (int w2 = 0; w2 < w - 2 ; w ++){
	
		spaces = spaces = " ";
		topfence = topfence + "-";
		top = "+" + topfence + "+";
	    }					
	    
	    for (int h2 = 0; h2 < h; h ++){

		fin = fin + "\n" + "|" + spaces + "|";
	    }
	}
	return top + fin + top;
    }
}				 


