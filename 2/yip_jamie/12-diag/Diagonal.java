import java.io.*;
import java.util.*;

public class Diagonal {
    public String diag (int n){
	String result = new String();
	result = "*" + "\n";
	for (n=1; n > 1 ; n--){
	    for (int m = 0; m < n; m ++) {
		result = result + " ";
	    }
	}
	return result; 
    }
}