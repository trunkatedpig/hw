import java.io.*;
import java.util.*;

public class diagonals {
    public String diag ( int n ) {
	String ans = new String();
	for ( int i = 0 ; i != n ; i++ ) {
	    ans = ans + help ( i , " ") + "*\n";
	}
	return ans;
    }

    public String diagWord ( String w ) {
	String ans = new String();
	for ( int i = 0 ; i < w.length() ; i++ ) {
	    ans = ans + help ( i , " ") + w.substring ( i , i + 1 ) + "\n";
	}
	return ans;
    }

    public String fence ( int h , int w ) {
	String ans = new String();
	ans = "+" + help ( w - 2 , "-" ) + "+\n";
	for ( int i = 0 ; i != h - 2 ; i++ ) {
	    ans = ans + "|" + help ( w - 2 , " " ) + "|\n";
	}
	ans = ans + "+"  + help ( w - 2 , "-" ) + "+";
	return ans;
    }

    public String help ( int i , String L ) {
	int j = 0;
	String ans = new String();
	while ( j != i ) {
	    ans = ans + L;
	    j = j + 1;
	}
	return ans;
    }
}
