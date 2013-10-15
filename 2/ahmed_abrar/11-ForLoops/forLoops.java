import java.io.*;
import java.util.*;

public class forLoops {
    public int fact ( int n ) {
	int ans = 1;
	for ( int x = n ; x != 0 ; x = x - 1 ) {
	    ans = ans * x;
	}
	return ans;
    }

    public String reverse ( String S ) {
	String ans = new String();
	for ( int i = 0 ; i != S.length() ; i ++ ) {
	    ans = S.substring ( i , i + 1) + ans;
	}
	return ans;
    }

    public String table ( int n , int m ) {
	String ans = new String();
	ans = "  ";
	for ( int i = 1 ; i != n + 1 ; i++ ) {
	    ans = ans + i + " ";
	}
	ans = ans + "\n";
	for ( int i = 1 ; i != m + 1 ; i++ ) {
	    ans = ans + i + " " + tableHelp ( i , n ) + "\n";
	}
	return ans;
    }

    public String tableHelp ( int i , int n ) {
	String ans = new String();
	for ( int j = 1 ; j != n + 1 ; j++ ) {
	    ans = ans + j*i + " ";
	}
	return ans;
    }
}
