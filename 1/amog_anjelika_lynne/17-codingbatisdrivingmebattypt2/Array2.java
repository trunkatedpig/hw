import java.io.*;
import java.util.*;

public class Array2 {
    public int[] revFill(int n) {
	int[] rev = new int[n];
	for (int j = 0; j < n; j++) {
	 rev[j] = n;
	 n = n-1;
	}
	return rev;
    }
    public String toString (int[] a){
	String String1="";
	for (int i = 0; i < a.length; i++){
	    String1= "" + a[i] + ", ";
	}	
  
	return String1;
    }

}