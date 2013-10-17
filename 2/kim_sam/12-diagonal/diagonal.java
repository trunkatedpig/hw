import java.io.*;
import java.util.*;

public class diagonal {
    
    public String diag(int n) {
	int i;
	String result = "";
	for (i = 1; i != n + 1; i++){
	    for (int space = 0; space < i; space++) {
		result = result + " ";
	    }
	    result = result + "*\n";    
	}
	return result;
    }
}