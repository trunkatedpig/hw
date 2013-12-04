import java.io.*;
import java.util.*;

public class Forloops {

    public String diag(int n) {
	String result = "";
	int a;
	for (a=0; a<n; a++) {
	    int space;
	    for (space=0; space<a; space++) {
		result = result + " ";
	    }
	    result = result + "*\n";
	}
	return result;
    }

    public String diagWord(String w) {
	String result = "";
	int a ;
	for (a=0; a<w.length(); a++) {
	    int space;
	    for (space=0; space<a; space++) {
		result = result + " ";
	    }
	    result = result + w.substring(a,a+1) + "\n";
		}
	return result;
    }

    public String fence(int h,int w) {
	String fence = "";
	int height;
	for (height=1; height<=h; height++) {
	    if (height == 1 || height == h) {
		fence = fence + "+";
		int width;
		for (width=0; width<w-2; width++) {
		    fence = fence + "-";
		}
		fence = fence + "+\n";
	    }
	    else {
		fence = fence + "|";
		int width;
		for (width=0; width<w-2; width++) {
		    fence = fence + " ";
		}
		fence = fence + "|\n";
	    }
	}
	return fence;
    }
}
