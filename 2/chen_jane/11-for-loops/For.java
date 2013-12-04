import java.io.*;
import java.util.*;

public class For {

    public boolean isPrime(int n) {
	int divisor;
	for (divisor=n-1; divisor>=1; divisor-=1) {
	    if (n%divisor == 0) {
		return divisor == 1;
	    }
	}
	return divisor == 1;
    }

    public String Reverse(String s) {
	String newString;
	newString = "";
	int i;
	for (i=s.length()-1; i>=0; i-=1) {
	    newString = newString + s.substring(i,i+1);
	}
	return newString;
    }

    public String table(int n,int m) {
	String table;
	table = "\t";

	int top;
	for (top=1; top<=n; top+=1) {
	    table = table + top + "\t";
	}
	table = table + "\n";

	int row;
	for (row=1; row<=m; row+=1) {
	    table = table + row + "\t";
	    int column;
	    for (column=1; column<=n; column+=1) {
		table = table + column*row + "\t";
	    }
	    table = table + "\n";
	}
	return table;
    }

}
