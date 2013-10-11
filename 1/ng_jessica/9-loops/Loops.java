import java.io.*;
import java.util.*; 

public class Loops {
    
    public static int fact (int n) {
	int i; 
	i = 1; 
	while (n > 0) {
	    i = i * n;
	    n = n -1;
	}
	return i; 
    }

}
