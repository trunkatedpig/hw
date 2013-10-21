import java.io.*;
import java.util.*;

public class More{
    public String diag(int n){
	String newstring = "";
	for(int i = 1; i <= n; i = i + 1){
	    for(int j = 1; j <= i; j = j + 1){
		newstring = newstring + " ";
	    }
	    newstring = newstring + "*" + "\n";
	}
	return newstring;
    }

    public String diagWord(String w){
	String hogwarts = "";
	for(int g = 0; g <= (w.length() - 1); g = g + 1){
	    for(int h = 0; h <= g; h = h + 1){
		hogwarts  = hogwarts + " ";
	    }
	    hogwarts = hogwarts + w.charAt(g) + "\n";
	}
	return hogwarts;
    }
    
    public String fence(int x, int y){
	String skywalker = "+";
	for(int q = 1; q <= (x - 2); q = q + 1){
	    skywalker = skywalker + "-";
	}
	skywalker = skywalker + "+" + "\n";
	for(int w = 1; w <= (y - 2); w = w + 1){
	    skywalker = skywalker + "|";
	    for(int u = 1; u <= (x -2); u = u + 1){
		skywalker = skywalker + " ";
	    }
	    skywalker = skywalker + "|" + "\n";
	}
	skywalker = skywalker + "+";
	for(int q = 1; q <= (x - 2); q = q + 1){
	    skywalker = skywalker + "-";
	}
	skywalker = skywalker + "+" + "\n";
	return skywalker;
    }
	    
}
	    
