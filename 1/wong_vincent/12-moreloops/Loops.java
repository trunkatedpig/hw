import java.io.*;
import java.util.*;

public class Loops{

    public String diag(int n) {
	int a;

	for(int i=0;i<n;i=i+1) {
	    a = i;
	    while (a>=0) {
		System.out.print(" ");
		a = a - 1;
	    }
	    System.out.println("*");
	}
	return " ";
    }

    public String diagWord(String w) {
	int a;

	for (int i=0;i<w.length();i=i+1) {
	    a = i;
	    while (a>=0) {
		System.out.print(" ");
		a = a - 1;
	    }
	    System.out.println(w.substring(i,i+1));
	}
	return " ";
    }

    public String fence(int h, int w) {
	//int d = w - 2;
	
	for (int x = 1;x <= h;x = x + 1) {
	    
	    int d = w - 2;
	    
	    if (x == 1 || x == h) {
		System.out.print("+");
		while (d > 0) {
		    System.out.print("-");
		    d = d - 1;
		}
		System.out.println("+");
	    }

	    else {
		System.out.print("|");
		while (d > 0) {
		    System.out.print(" ");
		    d = d - 1;
		}
		System.out.println("|");
	    }
	}

	return "";
    }
}

