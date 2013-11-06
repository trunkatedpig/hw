import java.io.*;
import java.util.*;

public class MoreLoops { 
    public String diag(int n) {
	String result = "";
	String temp = "";
	int i;
	int x; 
	for (i=0;i<n;n=n+1){ 
	    for (x=0; x<i; x=x+1) {
		temp = temp + " ";
	    }
	    temp = temp + "*";
	    temp = temp + "\n";
	}
	return temp;
    }

}