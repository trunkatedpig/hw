import java.io.*;
import java.util.*;

public class Moreloops {

    public String diag (int n) {
	String result = "";
	for (int count = 0; count < n; count++){
	    int j = count;
	    while (j > 0){
		result = result + " ";
		j = j - 1;
		}
	    result = result + "*" + "\n";
	}
	return result;
    }


}