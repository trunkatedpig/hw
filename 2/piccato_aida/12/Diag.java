import java.util.*;
import java.io.*;

public class Diag {
    public String diag(int n) {
	String s = "* \n";
	String result=s;
	int i;
	/*for (i=n-1; i>=0;i=i-1){
	    s=" "+s;
	    result=result+s;
	    }*/
	for (i = 0; i < n; i++) {
	    s = " " + s;
	    result = result + s;
	}
	return result;
    } 
    public String diagWord(String s) {
	String result;
	int i;
	
    }
}

    