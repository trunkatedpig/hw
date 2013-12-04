import java.io.*;
import java.util.*;

public class For {

    public String diag (int l) {
	int a;
	for (int i = 0; i < l; i = i + 1) {
	    a = i;
	    while ( a >= 0 ) {
		System.out.print(" ");
		a = a - 1;
	    }
	    System.out.println("*");
	}
	return " ";
    }

    public String diagWord (String s) {
	int a;
	for (int i = 0; i < s.length(); i = i + 1) {
	    a = i;
	    while ( a >= 0 ) {
		System.out.print(" ");
		a = a - 1;
	    }
	    System.out.println(s.substring(i, i+1));
	}
	return " ";
    }
    
    public String fence (int h, int w) {
	if (h>1 && w>1) {
	    int t = w - 2;
	    for (int x = 1; x <= h; x = x + 1) {
		t = w - 2;

		if (x == 1 || x == h) {
		    System.out.print("+");
		    while (t > 0) {
			System.out.print("-");
			t = t - 1;
		    }
		    System.out.println("+");
		}
		else {
		    System.out.print("|");
		    while (t > 0) {
			System.out.print(" ");
			t = t - 1;
		    }
		    System.out.println("|");
		}   
	    }
	}
	return " ";
    }
}
